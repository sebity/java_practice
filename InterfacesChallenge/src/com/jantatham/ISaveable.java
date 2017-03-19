package com.jantatham;

import java.util.List;

/**
 * Created by jan on 18/03/17.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
