'use strict'

var demoApp = angular.module('register', ['register.controllers', 'register.services']);
demoApp.constant("CONSTANTS", {
    getUserByIdUrl: "/user/getUser/",
    getAllUsers: "/user/getAllUsers",
    saveUser: "/user/saveUser"
});