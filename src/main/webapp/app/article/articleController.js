/*App.controller('articleController', ['$scope', '$http', function ($scope, $http) {
		 
			alert("22222");
 
		}]);*/
		
/*
 *html： app/seat/ProjectSeat.html
 *LQ
 *7/11/2017
 */
var articleControllers = angular.module('articleControllers', []);
articleControllers.service('articleService', [ '$http', '$q', function($http, $q) {
    return {
    	getArticles : function(){//get ALL projects    		
    		return $http.get('api/index/articles.json');    		
    	}
    };
} ]);
articleControllers.controller('articleController', function($scope, $rootScope, $state, articleService, $element,$stateParams) {
	 alert($stateParams.aid);
	
	
	
	
});
