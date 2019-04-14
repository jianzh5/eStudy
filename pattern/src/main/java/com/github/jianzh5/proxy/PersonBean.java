package com.github.jianzh5.proxy;

/**
 * <p>
 * <code>PersonBean</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/10上午8:40
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String geder);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);

}
