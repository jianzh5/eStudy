package com.github.jianzh5.proxy;

/**
 * <p>
 * <code>PersonBeanImpl</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/10上午8:42
 */
public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if(ratingCount == 0){
            return 0;
        }else{
            return (rating/ratingCount);
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount ++ ;
    }
}
