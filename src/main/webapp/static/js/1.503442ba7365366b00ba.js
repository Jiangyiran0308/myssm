webpackJsonp([1],{h7YT:function(t,n){},ua3t:function(t,n,e){"use strict";Object.defineProperty(n,"__esModule",{value:!0});var s={name:"test",props:{},components:{},data:function(){return{testData:"",testData2:"null"}},mounted:function(){var t=this;this.$http.get("/data",{params:{user:"123456"}}).then(function(n){t.testData=n.data}).catch(function(t){}),this.$http.post("/test",{username:"jiangyiran",password:"123456"}).then(function(n){t.testData2=n.data}).catch(function(t){})},methods:{getSuccessMessage:function(){this.$http.get("/messagesuccess").then(function(t){console.log(t)}).catch(function(t){console.log(t)})},getInfoMessage:function(){this.$http.get("/messageinfo").then(function(t){console.log(t)}).catch(function(t){console.log(t)})},getWarnMessage:function(){this.$http.get("/messagewarn").then(function(t){console.log(t)}).catch(function(t){})},getFailMessage:function(){this.$http.get("/messagefail").then(function(t){console.log(t)}).catch(function(t){})},getInfoData:function(){this.$http.get("/datainfo").then(function(t){console.log(t)}).catch(function(t){})}}},o={render:function(){var t=this,n=t.$createElement,e=t._self._c||n;return e("div",[e("div",[t._v("\n  后端传来的数据为：\n  "+t._s(t.testData)+"\n  ")]),t._v(" "),e("div",[t._v("\n    "+t._s(t.testData2)+"\n  ")]),t._v(" "),e("div",[e("el-button",{on:{click:t.getSuccessMessage}},[t._v("成功消息")]),t._v(" "),e("el-button",{on:{click:t.getInfoMessage}},[t._v("普通消息")]),t._v(" "),e("el-button",{on:{click:t.getWarnMessage}},[t._v("告警消息")]),t._v(" "),e("el-button",{on:{click:t.getFailMessage}},[t._v("失败消息")]),t._v(" "),e("el-button",{on:{click:t.getInfoData}},[t._v("数据")])],1)])},staticRenderFns:[]};var a=e("VU/8")(s,o,!1,function(t){e("h7YT")},"data-v-40a2dcd1",null);n.default=a.exports}});
//# sourceMappingURL=1.503442ba7365366b00ba.js.map