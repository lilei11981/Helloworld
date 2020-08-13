package com.company.zoo.abc.demo18;

/**
 * @author lilei
 * @date 2020-08-13 13:27
 * @apiNote
 */

public class SoccerPlayer {
    private String name;
    private Soccer soccer;

    public static void main(String[] args) {
        Soccer soccer = new Soccer();
        soccer.setSoccerName("name");
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        soccerPlayer.setSoccer(soccer);
        System.out.println(soccerPlayer.getSoccer().getSoccerName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Soccer getSoccer() {
        return soccer;
    }

    public void setSoccer(Soccer soccer) {
        this.soccer = soccer;
    }
}
