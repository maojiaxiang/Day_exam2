package mao.bw.com.maojiaxiang20190610.bean;

/**
 * @Auther: 毛佳翔
 * @Date: 2019/6/10 08:57:37
 * @Description: 描述信息
 */
public class MovieBean {
  /*  	"followMovie": 2,
                "id": 18,
                "imageUrl": "http://172.17.8.100/images/movie/stills/hjxd/hjxd1.jpg",
                "name": "黄金兄弟",
                "rank": 5,
                "summary": "狮王（郑伊健 饰）、火山（陈小春 饰）、Bill（谢天华 饰）、淡定（钱嘉乐 饰）、老鼠（林晓峰 饰）五个出生入死的兄弟，在恩师曹sir（曾志伟 饰）的带领下，为了救济儿童而偷取特效药，却惨遭设局，陷入枪林弹雨的险境之中。兄弟们抱着视死如归的豪情，展开一连串的追查与激战。他们明白，即使无法活着回来，也比一人活着痛快！",
                "type": 2*/
    private String followMovie;
    private String id;
    private String imageUrl;
    private String name;
    private String rank;
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
