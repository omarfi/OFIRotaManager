'use strict';

var RMApp = angular.module('RMApp', [
    'ngCookies',
    'ngRoute',
    'ngResource'
]);

RMApp.config(['$httpProvider', function ($httpProvider) {
    $httpProvider.defaults.withCredentials = true;
    $httpProvider.defaults.xsrfCookieName = 'CSRF-TOKEN'; // The name of the cookie sent by the server
    $httpProvider.defaults.xsrfHeaderName = 'X-CSRF-TOKEN'; // The default header name picked up by Spring Security
}]);

RMApp.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/', {
        templateUrl : 'dashboard.html',
        controller : 'DashboardCtrl'
    }).when('/login', {
        templateUrl : 'login.html',
        controller : 'NavigationCtrl'
    }).otherwise('/');
}]);

