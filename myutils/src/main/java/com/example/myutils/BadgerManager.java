package com.example.myutils;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;


public class BadgerManager extends AppCompatActivity {
    MenuBadger menuBadger;

    private Context context;
    private static int count;

    public BadgerManager(Context context, int count) {
        this.context = context;
        this.count = count;
    }

    public MenuItem setBadgerToMenuICon(Menu menu,int menuIcon,int menuItemID)
    {
      MenuItem menuItem;
      menuItem = menu.findItem(menuItemID);
      menuItem.setIcon(MenuBadger.convertLayoutToImage(context,count,menuIcon));
      return  menuItem;
    }


    public void onAddProduct() {
        count++;
        invalidateOptionsMenu();
    }


    public void onRemoveProduct() {
        count--;
        invalidateOptionsMenu();
    }
}
