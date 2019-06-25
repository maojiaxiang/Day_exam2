package mao.bw.com.day_exam.bean;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/9 16:17:22
 * @Description: 描述信息
 */
public class MovieBean {
 /*   "followMovie": 2,
            "id": 1,
            "imageUrl": "http://172.17.8.100/images/movie/stills/wbsys/wbsys1.jpg",
            "name": "我不是药神",
            "rank": 0,
            "releaseTime": 1530720000000,
            "releaseTimeShow": "2018-07-05",
            "summary": "一位不速之客的意外到访，打破了神油店老板程勇（徐峥 饰）的平凡人生，他从一个交不起房租的男性保健品商贩，一跃成为印度仿制药“格列宁”的独家代理商。收获巨额利润的他，生活剧烈变化，被病患们冠以“药神”的称号。但是，一场关于救赎的拉锯战也在波涛暗涌中慢慢展开......",
            "type": 1*/
    private String followMovie;
    private String id;
    private String imageUrl;
    private String name;
    private String rank;
    private String releaseTime;
    private String releaseTimeShow;
    private String summary;
    private String type;

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
