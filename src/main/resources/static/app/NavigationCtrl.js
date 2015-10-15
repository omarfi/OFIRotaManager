'use strict';

RMApp.controller('NavigationCtrl', function($rootScope, $scope, $http, $location, $route, $cookies, $q, $resource, Cookies, Csrf, Login) {

    /*$scope.tab = function(route) {
        return $route.current && route === $route.current.controller;
    };*/

    /*var authenticate = function(credentials, callback) {

        var headers = credentials ? {
            authorization : "Basic "
            + btoa(credentials.shopId + ":"
                + credentials.password)
        } : {};

        $http.get('shop', {
            headers : headers
        }).success(function(data) {
            if (data.name) {
                $rootScope.authenticated = true;
            } else {
                $rootScope.authenticated = false;
            }
            callback && callback($rootScope.authenticated);
        }).error(function() {
            $location.path("/login");
            $rootScope.authenticated = false;
            callback && callback(false);
        });

    }*/

    $scope.credentials = {
        shopId: '',
        password: ''
    };

    $scope.login = function () {
        Login.login($scope.credentials.shopId, $scope.credentials.password, function (data, status, headers, config) {
            // Success handler
            console.info('The user has been successfully logged in! ', data, status, headers, config);
            $location.url("/");
            $scope.error = false;
            $rootScope.authenticated = true;

        }, function(data, status, headers, config) {
            // Failure handler
            console.error('Something went wrong while trying to login... ', data, status, headers, config);
            $location.url("/login");
            $scope.error = true;
            $rootScope.authenticated = false;
        });
    };

    $scope.login();

});