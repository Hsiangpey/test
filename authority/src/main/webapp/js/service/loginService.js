//服务层
app.service('loginService',function ($http) {
    this.LoginInto=function () {
        return $http.get('/login/userCheck.do');
    }
})