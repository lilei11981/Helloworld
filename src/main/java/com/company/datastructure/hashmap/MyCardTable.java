package com.company.datastructure.hashmap;

/**
 * @author lilei
 * @date 2020-06-17 10:03
 * @apiNote
 */

public class MyCardTable {
    private Long id;
    private String bank;
    private String head;
    private Integer length;

    public MyCardTable(Long id, String bank, String head, Integer length) {
        this.id = id;
        this.bank = bank;
        this.head = head;
        this.length = length;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "MyCardTable{" +
                "id=" + id +
                ", bank='" + bank + '\'' +
                ", head='" + head + '\'' +
                ", length=" + length +
                '}';
    }
}
