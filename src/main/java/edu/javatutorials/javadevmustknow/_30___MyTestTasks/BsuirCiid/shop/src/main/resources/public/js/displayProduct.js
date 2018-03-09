var app = angular.module("shopApp", []);

app.controller("ProductControllerJs", function ($scope, $http) {

    $scope.products = [];

    $http.get('/api/getAllProducts').then(function (response) {
        $scope.products=response.data;
    });

});