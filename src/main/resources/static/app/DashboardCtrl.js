'use strict';

RMApp.controller('DashboardCtrl', function ($scope, $rootScope, $location, $http, $route, $cookies, $q, $resource, Cookies, Csrf, Login) {

    $scope.logout = function () {
        Login.logout(function (data, status, headers, config) {
            // Success handler
            //TODO: test this: $scope.credentials = {shopId: '', password: ''};
            delete $cookies['JSESSIONID'];
            $rootScope.authenticated = false;
            console.info('The user has been logged out!');
            $location.url('/login');

        }, function (data, status, headers, config) {
            // Failure handler
            console.error('Something went wrong while trying to logout... ', data, status, headers, config);
        });
    };
})