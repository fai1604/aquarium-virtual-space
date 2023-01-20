package org.aquarium;

import javafx.scene.control.Button;

class CustomStack {
    private Button button;
    private Integer index;
    private String entityName;

    public CustomStack(Button button, Integer index, String entityName) {
        this.button = button;
        this.index = index;
        this.entityName = entityName;
    }



    /**
     * @param button the button to set
     */
    public void setButton(Button button) {
        this.button = button;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * @param entityName the entityName to set
     */
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }


    /**
     * @return Button return the button
     */
    public Button getButton() {
        return button;
    }

    /**
     * @return Integer return the index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * @return String return the entityName
     */
    public String getEntityName() {
        return entityName;
    }

}