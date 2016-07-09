# 5sing-mobile-api

## Description
5sing移动端API

## API

### *检查登录状态
[get] http://mobileapi.5sing.kugou.com/user/checksign
##### queryString
* sign: token
* version: api版本

### *乐库-轮播图
[get] http://mobileapi.5sing.kugou.com/other/getAdvert
##### queryString
* advert_id: 轮播图id
* version: api版本

### *乐库-推荐
[get] http://mobileapi.5sing.kugou.com/song/GetRecommend
##### queryString
* version: api版本

### 排行榜
[get] http://mobileapi.5sing.kugou.com/rank/list
##### queryString
* version: api版本

### *动态
[get] http://mobileapi.5sing.kugou.com/message/dynamic
##### queryString
* sign: token
* pageindex: 页数
* pagesize: 每页条数
* fields: 需要显示哪些字段
* version: api版本
