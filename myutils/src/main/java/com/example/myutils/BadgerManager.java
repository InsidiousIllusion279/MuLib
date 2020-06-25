package com.example.myutils;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;


public class BadgerManager extends AppCompatActivity {
    MenuBadger menuBadger;

    private Context context;
    private int menu_item_id;
    private int menu_icon;
    private Menu menu;
    private int count;

    public BadgerManager(Context context, int menu_item_id, int menu_icon, Menu menu, int count) {
        this.context = context;
        this.menu_item_id = menu_item_id;
        this.menu_icon = menu_icon;
        this.menu = menu;
        this.count = count;
    }

    public MenuItem setBadgerToMenuICon()
    {
      MenuItem menuItem;
      menuItem = menu.findItem(menu_item_id);
      menuItem.setIcon(MenuBadger.convertLayoutToImage(context,count,menu_icon));
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
