package com.example.android.sunshine;

public interface ItemMoveDismissListener {

    boolean onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);
}
