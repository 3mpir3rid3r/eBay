'use strict'

var module = angular.module('register.controllers', []);
module.controller("UserController", ["$scope", "UserService",
    function ($scope, UserService) {

        $scope.saveUser = function () {
            UserService.saveUser($scope.userDto).then(function () {
                console.log("works");

                UserService.getAllUsers().then(function (value) {
                    $scope.allUsers = value.data;
                }, function (reason) {
                    console.log("error occured");
                }, function (value) {
                    console.log("no callback");
                });

            }, function (reason) {
                console.log("error occured");
            }, function (value) {
                console.log("no callback");
            });
        }
    }]);