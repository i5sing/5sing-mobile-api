# 5sing-mobile-api

## Description
中国原创音乐基地5sing移动端API

## API
currentVersion: 6.0.3

### *检查登录状态
[get] http://mobileapi.5sing.kugou.com/user/checksign
* sign: token
* version: api版本

### *获取轮播图列表
[get] http://mobileapi.5sing.kugou.com/other/getAdvert
* advert_id: 轮播图id
* version: api版本

### *每日推荐
[get] http://mobileapi.5sing.kugou.com/song/getRecommendDailyList
* pagesize: 每页条数
* page: 页数
* version: api版本

### *获取专栏
[get] http://mobileapi.5sing.kugou.com/song/GetRecommend
* version: api版本

### *获取专栏详情
[get] http://mobileapi.5sing.kugou.com/song/GetRecommendSingle
* channel_id: 专栏id
* page: 页数
* pagesize: 每页条数
* version: api版本

### *获取排行榜概览
[get] http://mobileapi.5sing.kugou.com/rank/list
* version: api版本

### *获取排行榜更新时间列表
[get] http://mobileapi.5sing.kugou.com/song/listsupportcardcycle
* version: api版本

### *获取排行榜详情
[get] http://mobileapi.5sing.kugou.com/rank/detail
* id: yc, fc, bz, list23
* pageindex: 页数
* pagesize: 每页条数
* time: 排行榜更新列表中的time
* userfields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC,YCRQ,FCRQ,CC,BG,DJ,RC,MC,AU,SR,SG,VG,ISC,F
* songfields: ID,SN,SK,SW,SS,ST,SI,CT,M,S,ZQ,WO,ZC,HY,YG,CK,D,RQ,DD,E,R,RC,SG,C,CS,LV,LG,SY,UID,PT,SCSR,SC
* version: api版本

### *获取最受欢迎歌曲列表
[get] http://mobileapi.5sing.kugou.com/song/listbysupportcard
* time: 排行榜更新列表中的time
* limit: 获取条数
* songfields: ID,SN,SK,SW,SS,ST,SI,CT,M,S,ZQ,WO,ZC,HY,YG,CK,D,RQ,DD,E,R,RC,SG,C,CS,LV,LG,SY,UID,PT,SCSR,SC
* userfields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC,YCRQ,FCRQ,CC,BG,DJ,RC,MC,AU,SR,SG,VG,ISC,F
* maxid: 0
* version: api版本

### *获取歌单列表
[get] http://goapi.5sing.kugou.com/getSongListSquareRecommended
* index: 页数
* version: api版本

### *筛选歌单
[get] http://goapi.5sing.kugou.com/search/songSquare
* label: 歌单标签
* sortType: 0, 1
* pn: 页数
* ps: 每页条数
* version: api版本

### *获取歌单详情
[get] http://mobileapi.5sing.kugou.com/song/getsonglist
* id: 歌单id
* version: api版本

### *歌单中歌曲列表
[get] http://mobileapi.5sing.kugou.com/song/getsonglistsong
* id: 歌单id
* songfields: ID,SN,SK,SW,SS,ST,SI,CT,M,S,ZQ,WO,ZC,HY,YG,CK,D,RQ,DD,E,R,RC,SG,C,CS,LV,LG,SY,UID,PT,SCSR,SC
* userfields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC,YCRQ,FCRQ,CC,BG,DJ,RC,MC,AU,SR,SG,VG,ISC,F
* version: api版本

### *音乐人列表
[get] http://mobileapi.5sing.kugou.com/user/listmusician
* pageindex: 页数
* pagesize: 每页条数
* fields: ID,NN,I,YCRQ,FCRQ,TYC,TFC,TBZ,TFD,TFS,SC,M
* songfields: ID,SN,SK,SW,S,UID,DD
* version: api版本

### *获取新入驻音乐人列表
[get] http://mobileapi.5sing.kugou.com/musician/latestList
* pagesize: 每页条数
* pageindex: 页数
* songfields: ID,SN,SK,SW,SS,ST,SI,CT,M,S,ZQ,WO,ZC,HY,YG,CK,D,RQ,DD,E,R,RC,SG,C,CS,LV,LG,SY,UID,PT,SCSR,SC
* version: api版本

### *获取动态
[get] http://mobileapi.5sing.kugou.com/message/dynamic
* sign: token
* pageindex: 页数
* pagesize: 每页条数
* fields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC,DJ
* version: api版本

### *检查是否关注歌手
[get] http://mobileapi.5sing.kugou.com/follow/check
* followuserid: 用户id
* sign: token
* version: api版本

### *检查是否收藏歌单
[get] http://mobileapi.5sing.kugou.com/song/songlistcollectioncheck
* id: 歌单id
* sign: token
* version: api版本

### *添加访问足迹
[get] http://mobileapi.5sing.kugou.com/user/addvisit
* sign: token
* owneruserid: 用户id
* version: api版本

### *获取用户信息
[get] http://mobileapi.5sing.kugou.com/user/get
* userid: 用户id
* fields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC,YCRQ,FCRQ,CC,BG,DJ,RC,MC,AU,SR,SG,VG,ISC,F,OP,UBG,ISH
* version: api版本

### *获取用户歌曲
[get] http://mobileapi.5sing.kugou.com/song/user
* userid: 用户id
* songtype: yc, fc, bz
* pageindex: 页数
* pagesize: 每页条数
* songfields: ID,SN,SK,SW,SS,ST,SI,CT,M,S,ZQ,WO,ZC,HY,YG,CK,D,RQ,DD,E,R,RC,SG,C,CS,LV,LG,SY,UID,PT,SCSR,SC
* userfields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC,YCRQ,FCRQ,CC,BG,DJ,RC,MC,AU,SR,SG,VG,ISC,F
* version: api版本

### *广场
[get] http://mobileapi.5sing.kugou.com/message/square
* ordering: 0, 1 0:最新, 2:最热
* sign: token
* pageindex: 页数
* pagesize: 每页条数
* fields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC,DJ

### *获取歌曲地址
[get] http://mobileapi.5sing.kugou.com/song/getSongUrl
* songtype: yc, fc, bz
* songid: 歌曲id
* version: api版本

### *获取直播列表
[get] http://5singlive.kugou.com/api.php
* action: Mobile
* fun: getTrailer
* version: api版本

### *搜索
[get] http://goapi.5sing.kugou.com/search/search
* k: 关键词
* t: 类型
* filterType: 过滤类型
* sortType: 0
* ps: 每页条数
* pn: 页数
* version: api版本

###### 备注：
t:0, filterType:1 原创   
t:0, filterType:2 翻唱   
t:0, filterType:3 伴奏   
t:2, filterType:0 用户   
t:1, filterType:0 歌单   

### *登录
[get] http://mobileapi.5sing.kugou.com/user/login
* username: 用户名
* password: 密码
* sign: 算法暂时未知
* version: api版本

###### 关于登录解决方案
[post] http://5sing.kugou.com/m/login.html
* name: 用户名
* pwd: 密码
* remember: yes  
登录成功后从Cookie中提取sign值

### *获取收藏的歌单
[get] http://mobileapi.5sing.kugou.com/song/songlistcollectionlist
* sign: token
* pageindex: 页数
* pagesize: 每页条数
* userfields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC,YCRQ,FCRQ,CC,BG,DJ,RC,MC,AU,SR,SG,VG,ISC,F
* version: api版本

### *获取歌曲信息
[get] http://mobileapi.5sing.kugou.com/song/newget
* songtype: fc, yc, bz
* songid: 歌曲id
* songfields: ID,SN,SK,SW,SS,ST,SI,CT,M,S,ZQ,WO,ZC,HY,YG,CK,D,RQ,DD,E,R,RC,SG,C,CS,LV,LG,SY,UID,PT,SCSR,SC
* userfields: ID,NN,I
* versiong: api版本

### *获取歌曲支持信息
[get] http://mobileapi.5sing.kugou.com/song/songwithuser
* songid: 歌曲id
* songtype: fc, yc, bz
* sign: token
* version: api版本

### *获取歌曲评论
[get] http://mobileapi.5sing.kugou.com/comments/list
* rootId: 歌曲id或者用户id
* rootKind: yc, fc, bz, guestBook
* maxId: 0
* fields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC,DJ
* version: api版本

### *获取歌曲粉丝贡献榜
[get] http://mobileapi.5sing.kugou.com/song/listforsupportcardfans
* songid: 歌曲id
* songtype: yc, fc, bz
* limit: 条数
* fields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC
* version: api版本

### *获取歌手关注列表
[get] http://mobileapi.5sing.kugou.com/follow/list
* userid: 用户id
* pagesize: 每页条数
* pageindex: 页数
* fields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC,YCRQ,FCRQ,CC,BG,DJ,RC,MC,AU,SR,SG,VG,ISC,F
* version: api版本

### *获取歌手粉丝列表
[get] http://mobileapi.5sing.kugou.com/fans/list
* userid: 用户id
* pagesize: 每页条数
* pageindex: 页数
* fields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC,YCRQ,FCRQ,CC,BG,DJ,RC,MC,AU,SR,SG,VG,ISC,F
* version: api版本

### *获取歌手访客列表
[get] http://mobileapi.5sing.kugou.com/user/visitors
* sign: token
* owneruserid: 用户id
* fields: ID,NN,I,B,P,C,SX,E,M,VT,CT,TYC,TFC,TBZ,TFD,TFS,SC,YCRQ,FCRQ,CC,BG,DJ,RC,MC,AU,SR,SG,VG,ISC,F
* version: api版本
