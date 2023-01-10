package org.aquarium;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Badge extends ImageView {
    public String badgeName;
    public String badgeAssetPath;

    public abstract void printBadgeWithDescription();
}
