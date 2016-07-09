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
