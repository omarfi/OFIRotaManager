var RMApp = angular.module('RMApp', ['ngRoute'])
    .config(function($routeProvider, $httpProvider) {

        $routeProvider.when('/', {
            templateUrl : 'modules/login/login.html',
            controller : 'LoginCtrl'
        }).when('/dashboard', {
            templateUrl : 'modules/dashboard/dashboard.html',
            controller : 'DashboardCtrl'
        }).otherwise('/');

        $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

    })
