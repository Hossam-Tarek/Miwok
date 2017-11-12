/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> familyMembers = new ArrayList<Word>();
        familyMembers.add(new Word("father", "әpә"));
        familyMembers.add(new Word("mother", "әta"));
        familyMembers.add(new Word("son", "angsi"));
        familyMembers.add(new Word("daughter", "tune"));
        familyMembers.add(new Word("older brother", "taachi"));
        familyMembers.add(new Word("younger brother", "chalitti"));
        familyMembers.add(new Word("older sister", "tete"));
        familyMembers.add(new Word("younger sister", "kolliti"));
        familyMembers.add(new Word("grandmother", "ama"));
        familyMembers.add(new Word("grandfather", "paapa"));



        WordAdapter adapter = new WordAdapter(this, familyMembers);

        // Find the list view and attach it to object
        ListView listView = (ListView) findViewById(R.id.list);

        // Set adapter to the list view
        listView.setAdapter(adapter);
    }
}
