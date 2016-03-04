package com.example.niuxm.practice.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by niuxm on 2016/3/3.
 */
public class Newsbean  {

    /**
     * postid : BH8UHE9N00014PRF
     * url_3w : http://news.163.com/16/0303/21/BH8UHE9N00014PRF.html
     * votecount : 865
     * replyCount : 1420
     * ltitle : 全国政协十二届四次会议今日在北京开幕
     * digest : 十二届四次会议议程通过；去年99.5%的提案已经办复。
     * url : http://3g.163.com/news/16/0303/21/BH8UHE9N00014PRF.html
     * docid : BH8UHE9N00014PRF
     * title : 习近平出席全国政协开幕会
     * source : 央视
     * priority : 220
     * lmodify : 2016-03-03 21:58:55
     * imgsrc : http://img4.cache.netease.com/3g/2016/3/3/20160303220817db676.jpg
     * subtitle :
     * boardid : news_guonei8_bbs
     * ptime : 2016-03-03 21:19:57
     */

    @SerializedName("postid") private String postid;
    @SerializedName("url_3w") private String url3w;
    @SerializedName("ltitle") private String ltitle;
    @SerializedName("digest") private String digest;
    @SerializedName("url") private String url;
    @SerializedName("docid") private String docid;
    @SerializedName("title") private String title;
    @SerializedName("source") private String source;
    @SerializedName("imgsrc") private String imgsrc;
    @SerializedName("subtitle") private String subtitle;
    @SerializedName("ptime") private String ptime;


    public void setPostid(String postid) { this.postid = postid;}


    public void setUrl3w(String url3w) { this.url3w = url3w;}


    public void setLtitle(String ltitle) { this.ltitle = ltitle;}


    public void setDigest(String digest) { this.digest = digest;}


    public void setUrl(String url) { this.url = url;}


    public void setDocid(String docid) { this.docid = docid;}


    public void setTitle(String title) { this.title = title;}


    public void setSource(String source) { this.source = source;}


    public void setImgsrc(String imgsrc) { this.imgsrc = imgsrc;}


    public void setSubtitle(String subtitle) { this.subtitle = subtitle;}


    public void setPtime(String ptime) { this.ptime = ptime;}


    public String getPostid() { return postid;}


    public String getUrl3w() { return url3w;}


    public String getLtitle() { return ltitle;}


    public String getDigest() { return digest;}


    public String getUrl() { return url;}


    public String getDocid() { return docid;}


    public String getTitle() { return title;}


    public String getSource() { return source;}


    public String getImgsrc() { return imgsrc;}


    public String getSubtitle() { return subtitle;}


    public String getPtime() { return ptime;}
}
