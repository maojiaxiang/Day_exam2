package movie.bw.com.maojiaxiang20190620.bean;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/20 08:56:44
 * @Description: 描述信息
 */
public class MovieBean {
    	/*	"followMovie": 2,
                    "id": 21,
                    "imageUrl": "http://172.17.8.100/images/movie/stills/zdn/zdn1.jpg",
                    "name": "找到你",
                    "rank": 0,
                    "releaseTime": 1537545600000,
                    "releaseTimeShow": "2018-09-22",
                    "summary": "律师李捷（姚晨 饰）正在离婚进行时，与前夫争夺女儿抚养权，拼命工作为给孩子最好的生活，幸有保姆孙芳（马伊琍 饰）帮忙照顾孩子视如己出。一日下班，李捷发现保姆孙芳和女儿毫无预兆地消失了，她内心最大的恐惧变成了现实。在追寻孙芳和女儿的下落时，她收到来自家人的谴责声讨，甚至遭到警方的怀疑。几乎崩溃的李捷，靠着惊人的勇气，踏上独自寻访的旅程。在追踪过程中，李捷逐渐接近了另一个女人——保姆孙芳的人生故事，她的身份原先都是谎言，而真相也将浮出水面……",
                    "type": 2*/
    	private String followMovie;
    private String id;
    private String imageUrl;
    private String name;
    private String rank;
    private String releaseTime;
    private String releaseTimeShow;
    private String summary;
    private String type;

    public MovieBean(String followMovie, String id, String imageUrl, String name, String rank, String releaseTime, String releaseTimeShow, String summary, String type) {
        this.followMovie = followMovie;
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.rank = rank;
        this.releaseTime = releaseTime;
        this.releaseTimeShow = releaseTimeShow;
        this.summary = summary;
        this.type = type;
    }

    public String getFollowMovie() {
        return followMovie;
    }

    public void setFollowMovie(String followMovie) {
        this.followMovie = followMovie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getReleaseTimeShow() {
        return releaseTimeShow;
    }

    public void setReleaseTimeShow(String releaseTimeShow) {
        this.releaseTimeShow = releaseTimeShow;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
