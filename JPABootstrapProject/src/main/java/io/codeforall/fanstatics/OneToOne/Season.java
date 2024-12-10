package io.codeforall.fanstatics.OneToOne;

import javax.persistence.Embeddable;

@Embeddable
public class Season {
    private int count;
    private String season_name;

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.season_name = name;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return season_name;
    }
}
