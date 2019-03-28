'use strict'

angular.module('application.services', []).factory('UserService',
    ["$http", "CONSTANTS",
        function ($http, CONSTANTS) {
            var service = {};
            service.getUserById = function (userId) {
                return $http.get(CONSTANTS.getUserByIdUrl + userId);
            }
            service.getAllUsers = function () {
                return $http.get(CONSTANTS.getAllUsers);
            }
            service.saveUser = function (userDto) {
                return $http.post(CONSTANTS.saveUser, userDto).then(function (responce) {
                    return responce.data;
                }, function (reason) {
                    return false;
                });
            }
            return service;
        }
    ]
).factory('ProductSummeryService',
    ["$http", "CONSTANTS",
        function ($http, CONSTANTS) {
            var service = {};
            service.getUserById = function (userId) {
                return $http.get(CONSTANTS.getUserByIdUrl + userId);
            }
            service.getAllUsers = function () {
                return $http.get(CONSTANTS.getAllUsers);
            }
            service.saveUser = function (userDto) {
                return $http.post(CONSTANTS.saveUser, userDto).then(function (responce) {
                    return responce.data;
                }, function (reason) {
                    return false;
                });
            }
            return service;
        }
    ]
).factory('SideBarService',
    ["$http", "CONSTANTS",
        function ($http, CONSTANTS) {
            var service = {};
            service.getCatergorys = function () {
                return $http.get(CONSTANTS.getCatergorys).then(function (responce) {
                    return responce.data;
                }, function (reason) {
                    return false;
                });
            }
            service.getAllUsers = function () {
                return $http.get(CONSTANTS.getAllUsers);
            }
            service.saveUser = function (userDto) {
                return $http.post(CONSTANTS.saveUser, userDto).then(function (responce) {
                    return responce.data;
                }, function (reason) {
                    return false;
                });
            }
            return service;
        }
    ]
).factory('LoginService',
    ["$http", "CONSTANTS",
        function ($http, CONSTANTS) {
            var service = {};
            service.proceedLogin = function (loginDto) {
                return $http.post(CONSTANTS.getUserByLogin, loginDto).then(function (responce) {
                    if (responce.data) {
                        return service.getUser();
                    } else {
                        return responce;
                    }
                }, function (reason) {
                    return reason;
                });

            }
            service.proceedLogout = function () {
                var userSessionDto = $http.get(CONSTANTS.userLogout);
                return userSessionDto;
            }
            service.getUser = function () {
                var userSessionDto = $http.get(CONSTANTS.getUserSession);
                return userSessionDto;
            }
            return service;
        }
    ]
).factory('CarouseService',
    ["$http", "CONSTANTS",
        function ($http, CONSTANTS) {
            var service = {};
            service.getItems = function () {
                return $http.get(CONSTANTS.getItems).then(function (responce) {
                    return responce.data;
                }, function (reason) {
                    return reason;
                });

            }
            service.getItemsById = function (inputItemIdValue) {
                return $http.get(CONSTANTS.getItemById + inputItemIdValue).then(function (responce) {
                    return responce.data;
                }, function (reason) {
                    return reason;
                });
            }
            service.getUser = function () {
                var userSessionDto = $http.get(CONSTANTS.getUserSession);
                return userSessionDto;
            }
            return service;
        }
    ]
).factory('AddToCartService',
    ["$http", "CONSTANTS",
        function ($http, CONSTANTS) {
            var service = {};
            service.addToCart = function () {
                return $http.post(CONSTANTS.getItems).then(function (responce) {
                    return responce.data;
                }, function (reason) {
                    return reason;
                });

            }
            return service;
        }
    ]
);

