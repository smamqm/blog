/*App.controller('indexController', ['$scope', '$http', function ($scope, $http) {
		 
			alert("22222");
 
		}]);*/
		
/*
 *html： app//Project.html
 *LQ
 *7/11/2017
 */
var indexControllers = angular.module('indexControllers', []);
indexControllers.service('indexService', [ '$http', '$q', function($http, $q) {
    return {
    	getTags : function(){//get ALL projects    		
    		return $http.get('api/index/tags.json');    		
    	}
    };
} ]);
/*indexControllers.controller('indexController', function($scope, $rootScope, $state, indexService) {
	alert(1111);
	indexService.getTags(),then(function(tags){
		$scope.tags = tags.data;
	});
});*/

formApp.controller('indexController',function($scope, $rootScope, $state,  $http, $q) {
	//alert(1111);
	$http.get('api/index/categorys.json').then(function(categorys){
		$scope.categorys = categorys.data;
	});
});
