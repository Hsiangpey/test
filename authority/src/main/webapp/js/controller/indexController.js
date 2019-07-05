//登陆主页控制
app.controller('loginController',function ($scope,loginService) {

    $scope.LoginInto=function () {
        loginService.LoginInto().success(
            function (response) {
                $scope.loginInfo=response.loginInfo;
            }
        )
    }

})