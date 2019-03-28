'use strict'

var module = angular.module('application.controllers', []);

module.controller("UserController", ["$scope", "UserService",
    function ($scope, UserService) {

        $scope.maxDate = new Date();

        $scope.reset = function () {
            console.log("reset....");
            $scope.userDto = {};
            $scope.registerForm.$setPristine();
        }

        $scope.saveUser = function () {
            console.log("working....");
            if ($scope.registerForm.$valid) {
                UserService.saveUser($scope.userDto).then(function (data) {

                    if (data) {
                        $scope.userDto = {};
                        $scope.registerForm.$setPristine();
                        $scope.registerForm.$setUntouched();
                        alert("Successfully saved");
                    } else {
                        alert("Faild");
                        console.log("Faild");
                    }
                }, function (reason) {
                    console.log("error occured");
                }, function (value) {
                    console.log("no callback");
                });
            }
        }
    }]);

module.controller("LoginController", ["$scope", "$rootScope", "LoginService",
    function ($scope, $rootScope, LoginService) {

        $scope.logStatus = false;

        LoginService.getUser().then(function (responce) {
            $rootScope.logUser = responce.data.userFullName;
            if (responce.data.userFullName) {
                $scope.logStatus = true;
            }
        });

        $scope.reset = function () {
            console.log("reset....");
        }

        $scope.proceedLogout = function () {

            LoginService.proceedLogout().then(function (responce) {

                console.log("Logout....");
                location.reload();

            }, function (reason) {
                alert("Logout failed");
                console.log("error occured" + reason);
            }, function (value) {
                console.log("no callback");
            });
        }

        $scope.proceedLogin = function () {
            if ($scope.loginForm.$valid) {
                LoginService.proceedLogin($scope.loginDto).then(function (responce) {
                    console.log("working....");

                    if (responce.data) {

                        $scope.loginDto = {};
                        $scope.loginForm.$setPristine();
                        $scope.loginForm.$setUntouched();

                        console.log("Login done");
                        location.reload();
                    } else {
                        alert("Login failed");
                    }
                }, function (reason) {
                    alert("Login failed");
                    console.log("error occured" + reason);
                }, function (value) {
                    console.log("no callback");
                });
            }
        }
    }]);

module.controller("SideBarController", ["$scope", "SideBarService",
    function ($scope, SideBarService) {
        SideBarService.getCatergorys().then(function (responce) {
            $scope.allCatergorys = responce;
        }, function (reason) {
        });

    }]);
module.controller("CarouseController", ["$scope", "CarouseService",
    function ($scope, CarouseService) {
        CarouseService.getItems().then(function (responce) {
            $scope.allItems = responce;
        }, function (reason) {
        });

    }]);
module.controller("AddToCartController", ["$scope", "$rootScope", "AddToCartService",
    function ($scope, $rootScope, AddToCartService) {
        AddToCartService.addToCart($scope.addToCartDto).then(function (responce) {
            $scope.allItems = responce;
        }, function (reason) {
        });

    }]);
module.controller("ProductSummeryController", ["$scope", "$stateParams", "CarouseService",
    function ($scope, $stateParams, CarouseService) {
        $scope.inputItemIdValue = $stateParams.inputItemIdValue;

        CarouseService.getItemsById($scope.inputItemIdValue).then(function (responce) {
            $scope.item = responce;
            console.log(responce);
        }, function (reason) {
        });
    }]);