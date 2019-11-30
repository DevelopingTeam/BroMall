package com.team.bromall.model;

import java.io.Serializable;

public class PmsAlbumPic implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_album_pic.id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_album_pic.album_id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private Long albumId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pms_album_pic.pic
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pms_album_pic
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_album_pic.id
     *
     * @return the value of pms_album_pic.id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_album_pic.id
     *
     * @param id the value for pms_album_pic.id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_album_pic.album_id
     *
     * @return the value of pms_album_pic.album_id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public Long getAlbumId() {
        return albumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_album_pic.album_id
     *
     * @param albumId the value for pms_album_pic.album_id
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pms_album_pic.pic
     *
     * @return the value of pms_album_pic.pic
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pms_album_pic.pic
     *
     * @param pic the value for pms_album_pic.pic
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_album_pic
     *
     * @mbg.generated Fri Nov 29 11:29:29 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", albumId=").append(albumId);
        sb.append(", pic=").append(pic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}