package com.jacksonfdam.codelabs.codelab07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Main Activity of the AboutMe app. This app demonstrates:
 *     * LinearLayout with TextViews, ImageView, and ScrollView
 *     * ScrollView to display scrollable text
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
