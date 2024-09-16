const base = {
    get() {
        return {
            url : "http://localhost:8080/bianlidian/",
            name: "bianlidian",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/bianlidian/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "便利店库存管理系统"
        } 
    }
}
export default base
