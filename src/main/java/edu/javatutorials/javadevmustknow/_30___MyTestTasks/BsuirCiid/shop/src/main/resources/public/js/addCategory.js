var app = angular.module("shopApp", []);
app.controller("AddCategoryControllerJs", function ($scope, $http) {

    $scope.SendNewCategoryName = function () {
        $http.post('/addCategory', $scope.categoryName)
            .success(function (data, status, headers) {
                $scope.PostDataResponse = data;
                console.log("msg sent");

            })
            .error(function (data, status, header) {
                console.log("msg failed");
            });
    };

});