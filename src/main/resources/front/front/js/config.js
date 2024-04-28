
var projectName = '智慧社区网站';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '车位信息',
	url: './pages/cheweixinxi/list.html'
}, 
{
	name: '社区信息',
	url: './pages/shequxinxi/list.html'
}, 
{
	name: '周边服务',
	url: './pages/zhoubianfuwu/list.html'
}, 
{
	name: '问卷调查',
	url: './pages/wenjuandiaocha/list.html'
}, 
{
	name: '爱心助老',
	url: './pages/aixinzhulao/list.html'
}, 

{
	name: '通知公告',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/springboot224bf/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"客户","menuJump":"列表","tableName":"kehu"}],"menu":"客户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"在线报修","menuJump":"列表","tableName":"zaixianbaoxiu"}],"menu":"在线报修管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"投诉建议","menuJump":"列表","tableName":"tousujianyi"}],"menu":"投诉建议管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"车位信息","menuJump":"列表","tableName":"cheweixinxi"}],"menu":"车位信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"车位租买","menuJump":"列表","tableName":"cheweizumai"}],"menu":"车位租买管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"社区信息","menuJump":"列表","tableName":"shequxinxi"}],"menu":"社区信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"周边服务","menuJump":"列表","tableName":"zhoubianfuwu"}],"menu":"周边服务管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"问卷调查","menuJump":"列表","tableName":"wenjuandiaocha"}],"menu":"问卷调查管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"参与答卷","menuJump":"列表","tableName":"canyudajuan"}],"menu":"参与答卷管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"爱心助老","menuJump":"列表","tableName":"aixinzhulao"}],"menu":"爱心助老管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"客服中心","tableName":"chat"},{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"通知公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","预定"],"menu":"车位信息列表","menuJump":"列表","tableName":"cheweixinxi"}],"menu":"车位信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"社区信息列表","menuJump":"列表","tableName":"shequxinxi"}],"menu":"社区信息模块"},{"child":[{"buttons":["查看"],"menu":"周边服务列表","menuJump":"列表","tableName":"zhoubianfuwu"}],"menu":"周边服务模块"},{"child":[{"buttons":["查看","答卷"],"menu":"问卷调查列表","menuJump":"列表","tableName":"wenjuandiaocha"}],"menu":"问卷调查模块"},{"child":[{"buttons":["查看"],"menu":"爱心助老列表","menuJump":"列表","tableName":"aixinzhulao"}],"menu":"爱心助老模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"在线报修","menuJump":"列表","tableName":"zaixianbaoxiu"}],"menu":"在线报修管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"投诉建议","menuJump":"列表","tableName":"tousujianyi"}],"menu":"投诉建议管理"},{"child":[{"buttons":["查看","支付"],"menu":"车位租买","menuJump":"列表","tableName":"cheweizumai"}],"menu":"车位租买管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"社区信息","menuJump":"列表","tableName":"shequxinxi"}],"menu":"社区信息管理"},{"child":[{"buttons":["查看"],"menu":"参与答卷","menuJump":"列表","tableName":"canyudajuan"}],"menu":"参与答卷管理"},{"child":[{"buttons":["新增","查看"],"menu":"爱心助老","menuJump":"列表","tableName":"aixinzhulao"}],"menu":"爱心助老管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","预定"],"menu":"车位信息列表","menuJump":"列表","tableName":"cheweixinxi"}],"menu":"车位信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"社区信息列表","menuJump":"列表","tableName":"shequxinxi"}],"menu":"社区信息模块"},{"child":[{"buttons":["查看"],"menu":"周边服务列表","menuJump":"列表","tableName":"zhoubianfuwu"}],"menu":"周边服务模块"},{"child":[{"buttons":["查看","答卷"],"menu":"问卷调查列表","menuJump":"列表","tableName":"wenjuandiaocha"}],"menu":"问卷调查模块"},{"child":[{"buttons":["查看"],"menu":"爱心助老列表","menuJump":"列表","tableName":"aixinzhulao"}],"menu":"爱心助老模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"客户","tableName":"kehu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
