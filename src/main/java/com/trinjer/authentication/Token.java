package com.trinjer.authentication;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

/**
 *
 * Created by Andrew Tobilko on 08/08/16.
 *
 */
@Data(staticConstructor = "of")
public class Token<T extends Serializable> implements Serializable {

    private @NonNull T value;

}
