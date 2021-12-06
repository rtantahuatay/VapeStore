package com.kors.vapestore;

import androidx.fragment.app.Fragment;

public interface NavigationVape {
    void navigateTo(Fragment fragment, boolean addToBackStack);
}