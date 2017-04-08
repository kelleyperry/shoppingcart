package com.pusher.web.vo;

import java.io.Serializable;

/**
 * Created by kelleyperry on 4/8/17.
 */
public class ItemRequest implements Serializable {
    private static final long serialVersionUID = 7720978167137384733L;

    private Long id;

    private Integer quantity;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Integer getQuantity() { return quantity; }

    public void setQuantity(Integer quantity) { this.quantity = quantity; }
}
