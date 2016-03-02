package com.example.niuxm.practice.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class NewsListModle {

    /**
     * postid : PHOT3DD9000100AP
     * hasCover : false
     * hasHead : 1
     * replyCount : 18150
     * hasImg : 1
     * digest :
     * hasIcon : false
     * docid : 9IG74V5H00963VRO_BH5062N7liziweiupdateDoc
     * title : 山东高校边小旅馆林立 百米内十余个
     * order : 1
     * priority : 253
     * lmodify : 2016-03-02 08:31:44
     * boardid : photoview_bbs
     * ads : [{"title":"政协委员抵京 驻地宾馆礼仪举牌迎接","tag":"photoset","imgsrc":"http://img1.cache.netease.com/3g/2016/3/2/20160302134437fba8a.jpg","subtitle":"","url":"00AN0001|112077"},{"title":"叙多国记者遭炮击受伤 含中国籍记者","tag":"photoset","imgsrc":"http://img2.cache.netease.com/3g/2016/3/2/2016030211391852362.jpg","subtitle":"","url":"00AO0001|112072"},{"title":"人大记者证件发放 记者扫二维码领取","tag":"photoset","imgsrc":"http://img3.cache.netease.com/3g/2016/3/2/2016030210385601820.jpg","subtitle":"","url":"00AN0001|112061"},{"title":"印度\"高考\"开始 考生\"备战\"至最后","tag":"photoset","imgsrc":"http://img6.cache.netease.com/3g/2016/3/2/2016030210103153b7f.jpg","subtitle":"","url":"00AO0001|112054"},{"title":"意大利华人游行 反对歧视和暴力抢劫","tag":"photoset","imgsrc":"http://img1.cache.netease.com/3g/2016/3/2/20160302085016c1337.jpg","subtitle":"","url":"00AO0001|112045"}]
     * photosetID : 00AP0001|112041
     * template : manual
     * votecount : 16898
     * skipID : 00AP0001|112041
     * alias : Top News
     * skipType : photoset
     * cid : C1348646712614
     * hasAD : 1
     * imgextra : [{"imgsrc":"http://img3.cache.netease.com/3g/2016/3/2/20160302083304b1684.jpg"},{"imgsrc":"http://img5.cache.netease.com/3g/2016/3/2/2016030208330647c1a.jpg"}]
     * imgsrc : http://img4.cache.netease.com/3g/2016/3/2/20160302083347bc5f5.jpg
     * tname : 头条
     * ename : androidnews
     * ptime : 2016-03-02 08:31:44
     */

    @SerializedName("T1348647909107") private List<T1348647909107Entity>
            T1348647909107;


    public void setT1348647909107(List<T1348647909107Entity> T1348647909107) {
        this.T1348647909107 = T1348647909107;
    }


    public List<T1348647909107Entity> getT1348647909107() { return T1348647909107;}


    public static class T1348647909107Entity {
        @SerializedName("postid") private String postid;
        @SerializedName("hasCover") private boolean hasCover;
        @SerializedName("hasHead") private int hasHead;
        @SerializedName("replyCount") private int replyCount;
        @SerializedName("hasImg") private int hasImg;
        @SerializedName("digest") private String digest;
        @SerializedName("hasIcon") private boolean hasIcon;
        @SerializedName("docid") private String docid;
        @SerializedName("title") private String title;
        @SerializedName("order") private int order;
        @SerializedName("priority") private int priority;
        @SerializedName("lmodify") private String lmodify;
        @SerializedName("boardid") private String boardid;
        @SerializedName("photosetID") private String photosetID;
        @SerializedName("template") private String template;
        @SerializedName("votecount") private int votecount;
        @SerializedName("skipID") private String skipID;
        @SerializedName("alias") private String alias;
        @SerializedName("skipType") private String skipType;
        @SerializedName("cid") private String cid;
        @SerializedName("hasAD") private int hasAD;
        @SerializedName("imgsrc") private String imgsrc;
        @SerializedName("tname") private String tname;
        @SerializedName("ename") private String ename;
        @SerializedName("ptime") private String ptime;
        /**
         * title : 政协委员抵京 驻地宾馆礼仪举牌迎接
         * tag : photoset
         * imgsrc : http://img1.cache.netease.com/3g/2016/3/2/20160302134437fba8a.jpg
         * subtitle :
         * url : 00AN0001|112077
         */

        @SerializedName("ads") private List<AdsEntity> ads;
        /**
         * imgsrc : http://img3.cache.netease.com/3g/2016/3/2/20160302083304b1684.jpg
         */

        @SerializedName("imgextra") private List<ImgextraEntity> imgextra;


        public void setPostid(String postid) { this.postid = postid;}


        public void setHasCover(boolean hasCover) { this.hasCover = hasCover;}


        public void setHasHead(int hasHead) { this.hasHead = hasHead;}


        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }


        public void setHasImg(int hasImg) { this.hasImg = hasImg;}


        public void setDigest(String digest) { this.digest = digest;}


        public void setHasIcon(boolean hasIcon) { this.hasIcon = hasIcon;}


        public void setDocid(String docid) { this.docid = docid;}


        public void setTitle(String title) { this.title = title;}


        public void setOrder(int order) { this.order = order;}


        public void setPriority(int priority) { this.priority = priority;}


        public void setLmodify(String lmodify) { this.lmodify = lmodify;}


        public void setBoardid(String boardid) { this.boardid = boardid;}


        public void setPhotosetID(String photosetID) {
            this.photosetID = photosetID;
        }


        public void setTemplate(String template) { this.template = template;}


        public void setVotecount(int votecount) { this.votecount = votecount;}


        public void setSkipID(String skipID) { this.skipID = skipID;}


        public void setAlias(String alias) { this.alias = alias;}


        public void setSkipType(String skipType) { this.skipType = skipType;}


        public void setCid(String cid) { this.cid = cid;}


        public void setHasAD(int hasAD) { this.hasAD = hasAD;}


        public void setImgsrc(String imgsrc) { this.imgsrc = imgsrc;}


        public void setTname(String tname) { this.tname = tname;}


        public void setEname(String ename) { this.ename = ename;}


        public void setPtime(String ptime) { this.ptime = ptime;}


        public void setAds(List<AdsEntity> ads) { this.ads = ads;}


        public void setImgextra(List<ImgextraEntity> imgextra) {
            this.imgextra = imgextra;
        }


        public String getPostid() { return postid;}


        public boolean isHasCover() { return hasCover;}


        public int getHasHead() { return hasHead;}


        public int getReplyCount() { return replyCount;}


        public int getHasImg() { return hasImg;}


        public String getDigest() { return digest;}


        public boolean isHasIcon() { return hasIcon;}


        public String getDocid() { return docid;}


        public String getTitle() { return title;}


        public int getOrder() { return order;}


        public int getPriority() { return priority;}


        public String getLmodify() { return lmodify;}


        public String getBoardid() { return boardid;}


        public String getPhotosetID() { return photosetID;}


        public String getTemplate() { return template;}


        public int getVotecount() { return votecount;}


        public String getSkipID() { return skipID;}


        public String getAlias() { return alias;}


        public String getSkipType() { return skipType;}


        public String getCid() { return cid;}


        public int getHasAD() { return hasAD;}


        public String getImgsrc() { return imgsrc;}


        public String getTname() { return tname;}


        public String getEname() { return ename;}


        public String getPtime() { return ptime;}


        public List<AdsEntity> getAds() { return ads;}


        public List<ImgextraEntity> getImgextra() { return imgextra;}


        public static class AdsEntity {
            @SerializedName("title") private String title;
            @SerializedName("tag") private String tag;
            @SerializedName("imgsrc") private String imgsrc;
            @SerializedName("subtitle") private String subtitle;
            @SerializedName("url") private String url;


            public void setTitle(String title) { this.title = title;}


            public void setTag(String tag) { this.tag = tag;}


            public void setImgsrc(String imgsrc) { this.imgsrc = imgsrc;}


            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }


            public void setUrl(String url) { this.url = url;}


            public String getTitle() { return title;}


            public String getTag() { return tag;}


            public String getImgsrc() { return imgsrc;}


            public String getSubtitle() { return subtitle;}


            public String getUrl() { return url;}
        }

        public static class ImgextraEntity {
            @SerializedName("imgsrc") private String imgsrc;


            public void setImgsrc(String imgsrc) { this.imgsrc = imgsrc;}


            public String getImgsrc() { return imgsrc;}
        }
    }
}

