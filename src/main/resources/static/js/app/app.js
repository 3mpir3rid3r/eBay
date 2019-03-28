'use strict'

var myApp = angular.module('application', ['application.controllers', 'application.services', 'ui.router']);
myApp.constant("CONSTANTS", {
    getUserByIdUrl: "/user/getUser/",
    getAllUsers: "/user/getAllUsers",
    saveUser: "/user/saveUser",
    getUserByLogin: "/user/login/",
    userLogout: "/user/logout",
    getUserSession: "/user/getUserSesion",
    getCatergorys: "/item/getAllCatergory",
    getItems: "/item/getAllItems",
    getItemById: "/item/getItemById/",
    addToCart: "/item/addToCart"
});

myApp.config(function ($stateProvider) {

    var special_offer = {
        name: 'special_offer',
        url: '/special_offer',
        templateUrl: '/views/special_offer.html'
    }
    var home = {
        name: 'home',
        url: '/home',
        templateUrl: '/views/home.html'
    }

    var delivery = {
        name: 'delivery',
        url: '/delivery',
        templateUrl: '/views/delivery.html'
    }

    var register = {
        name: 'register',
        url: '/register',
        templateUrl: '/views/register.html'
    }
    var product_summary = {
        name: 'product_summary',
        url: '/product_summary',
        templateUrl: '/views/product_summary.html'
    }
    var contact = {
        name: 'contact',
        url: '/contact',
        templateUrl: '/views/contact.html'
    }
    var products = {
        name: 'products',
        url: '/products',
        templateUrl: '/views/products.html'
    }

    var product_details = {
        name: 'product_details',
        url: '/product_details/:inputItemIdValue',
        templateUrl: '/views/product_details.html',
        controller: 'ProductSummeryController'
    }
    var login = {
        name: 'login',
        url: '/login',
        templateUrl: '/views/login.html'
    }
    var legal_notice = {
        name: 'legal_notice',
        url: '/legal_notice',
        templateUrl: '/views/legal_notice.html'
    }
    var tac = {
        name: 'tac',
        url: '/tac',
        templateUrl: '/views/tac.html'
    }
    var faq = {
        name: 'faq',
        url: '/faq',
        templateUrl: '/views/faq.html'
    }
    var compair = {
        name: 'compair',
        url: '/compair',
        templateUrl: '/views/compair.html'
    }

    $stateProvider.state(special_offer);
    $stateProvider.state(delivery);
    $stateProvider.state(register);
    $stateProvider.state(product_summary);
    $stateProvider.state(home);
    $stateProvider.state(contact);
    $stateProvider.state(products);
    $stateProvider.state(product_details);
    $stateProvider.state(login);
    $stateProvider.state(legal_notice);
    $stateProvider.state(tac);
    $stateProvider.state(faq);
    $stateProvider.state(compair);
});