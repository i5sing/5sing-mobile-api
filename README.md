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

### *排行榜
[get] http://mobileapi.5sing.kugou.com/rank/list
##### queryString
* version: api版本

### *音乐人列表
[get] http://mobileapi.5sing.kugou.com/user/listmusician
##### queryString
* pageindex: 页数
* pagesize: 每页条数
* fields: ID,NN,I,YCRQ,FCRQ,TYC,TFC,TBZ,TFD,TFS,SC,M
* songfields: ID,SN,SK,SW,S,UID,DD
* version: api版本

### *新入驻音乐人列表
[get] http://mobileapi.5sing.kugou.com/musician/latestList
##### queryString
* pagesize: 每页条数
* pageindex: 页数
* songfields: ID,SN,SK,SW,SS,ST,SI,CT,M,S,ZQ,WO,ZC,HY,YG,CK,D,RQ,DD,E,R,RC,SG,C,CS,LV,LG,SY,UID,PT,SCSR,SC
* version: api版本

### *动态
[get] http://mobileapi.5sing.kugou.com/message/dynamic
##### queryString
* sign: token
* pageindex: 页数
* pagesize: 每页条数
* fields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC,DJ
* version: api版本
