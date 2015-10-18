'use strict';

RMApp.controller('DashboardCtrl', function ($scope, $rootScope, $location, $http, $route, $cookies, $q, $resource, Cookies, Csrf, Login) {

    var shopResources = $resource('/rest/shop', {}, {
        get: {method: 'GET', cache: false}
    });

    $scope.shop = '';

    var retrieveShop = function () {
        shopResources.get().$promise.then(function (response) {
            console.log('GET /rest/shop returned: ', response);
            $scope.shop = response.name;
            $scope.authenticated = response.authenticated
        })
            .catch(function(response) {
                if (response.status === 401) {
                    console.error('You need to login first!');
                    $location.url('/login');
                } else {
                    console.error('Something went wrong...', response);
                }
                $scope.authenticated = response.authenticated
            });
    };

    retrieveShop();

    $scope.logout = function () {
        Login.logout(function (data, status, headers, config) {
            // Success handler
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