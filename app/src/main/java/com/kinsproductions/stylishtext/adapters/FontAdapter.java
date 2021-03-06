package com.kinsproductions.stylishtext.adapters;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.kinsproductions.stylishtext.R;
import com.kinsproductions.stylishtext.model.Font;

import java.util.ArrayList;

import static android.content.Context.CLIPBOARD_SERVICE;


public class FontAdapter extends RecyclerView.Adapter<FontAdapter.MyViewHolder> {
    private ArrayList<Font> fontItems;
    private Activity activity;

    @Override
    @NonNull
    public FontAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(activity).inflate(R.layout.adapter_font, parent, false);
        return new MyViewHolder(row);
    }

    public FontAdapter(ArrayList<Font> fontItems, Activity activity) {
        this.fontItems = fontItems;
        this.activity = activity;

    }

    @Override
    public void onBindViewHolder(@NonNull final FontAdapter.MyViewHolder holder, final int position) {
        final Font f = fontItems.get(position);
        holder.title.setText(f.getFontName());
        StringBuilder strBld = new StringBuilder(f.getPreviewText());
        switch (position) {
            case 0:
                for (int charOne = 0; charOne <= strBld.length() - 1; charOne++) {
                    char a = strBld.charAt(charOne);
                    char newCh = getSpecialCharFirst(a);
                    strBld.setCharAt(charOne, newCh);

                }
                break;

            case 1:

                for (int charOne = 0; charOne <= strBld.length() - 1; charOne++) {
                    char a = strBld.charAt(charOne);
                    char newCh = getSpecialCharSecond(a);
                    strBld.setCharAt(charOne, newCh);

                }
                break;

            case 2:

                for (int charOne = 0; charOne <= strBld.length() - 1; charOne++) {
                    char a = strBld.charAt(charOne);
                    char newCh = getSpecialCharThird(a);
                    strBld.setCharAt(charOne, newCh);

                }
                break;
            case 3:

                for (int charOne = 0; charOne <= strBld.length() - 1; charOne++) {
                    char a = strBld.charAt(charOne);
                    char newCh = getSpecialCharFourth(a);
                    strBld.setCharAt(charOne, newCh);

                }
                break;

            case 4:

                for (int charOne = 0; charOne <= strBld.length() - 1; charOne++) {
                    char a = strBld.charAt(charOne);
                    char newCh = getSpecialCharFifth(a);
                    strBld.setCharAt(charOne, newCh);

                }
                break;
            case 5:

                for (int charOne = 0; charOne <= strBld.length() - 1; charOne++) {
                    char a = strBld.charAt(charOne);
                    char newCh = getSpecialCharSixth(a);
                    strBld.setCharAt(charOne, newCh);

                }
                break;

            case 6:

                for (int charOne = 0; charOne <= strBld.length() - 1; charOne++) {
                    char a = strBld.charAt(charOne);
                    char newCh = getSpecialCharSeventh(a);
                    strBld.setCharAt(charOne, newCh);

                }
                break;

            case 7:
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;


            case 8:

                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (charOne == 0) {
                            strBld.insert(charOne, '???');
                            ++charOne;
                        }


                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                            strBld.insert(++charOne, '???');


                        }

                        if (strBld.charAt(charOne) == ' ') {
                            strBld.deleteCharAt(--charOne);
                            strBld.insert(++charOne, '???');
                        }

                        if (strBld.length() - 1 == charOne) {
                            strBld.deleteCharAt(charOne);
                        }

                    }
                } else if (!f.getPreviewText().contains("???") && !f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne <= strBld.length() - 1; charOne++) {

                        if (charOne == 0) {
                            strBld.insert(charOne, '???');
                            ++charOne;
                        }

                        if (strBld.length() - 1 != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                            strBld.insert(++charOne, '???');


                        } else if (strBld.length() - 1 == charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }

                        if (strBld.charAt(charOne) == ' ' && charOne != 0) {
                            strBld.deleteCharAt(--charOne);
                            strBld.insert(++charOne, '???');
                        } else if (strBld.length() - 1 == charOne && strBld.charAt(charOne) == ' ' && charOne != 0) {
                            strBld.deleteCharAt(++charOne);
                        }

                    }

                }

                break;

            case 9:
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 10:
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;
            case 11:
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 12 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;
            case 13 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 14 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 15 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 16 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 17 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 18 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 19 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;



            case 20 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 21 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 22 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 23 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 24 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 25 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;


            case 26 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 27 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;


            case 28 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;

            case 29 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;
            case 30 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;
            case 31 :
                if ("Preview text".equals(f.getPreviewText())) {
                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }

                } else if (!f.getPreviewText().contains("???")) {

                    for (int charOne = 0; charOne < strBld.length(); charOne++) {
                        if (strBld.charAt(charOne) == ' ' && strBld.length()-1 != charOne) {
                            ++charOne;

                        }

                        if (strBld.length() != charOne && strBld.charAt(charOne) != ' ') {
                            strBld.insert(++charOne, '???');
                        }


                    }
                }
                break;



        }
        f.setPreviewText(strBld.toString());
        holder.description.setText(f.getPreviewText());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ClipboardManager clipboard = (ClipboardManager) activity.getSystemService(CLIPBOARD_SERVICE);
                String desStr = holder.description.getText().toString();
                Toast.makeText(activity, "Copied to clipboard! Your copied text is " + desStr, Toast.LENGTH_SHORT).show();
                ClipData clip = ClipData.newPlainText("simple text", desStr);
                if (clipboard != null) {
                    clipboard.setPrimaryClip(clip);
                }


            }
        });
    }


    private char getSpecialCharFirst(char a) {
        char ch = a;

        if (ch == 'A') {
            ch = '???';
        } else if (ch == 'B') {
            ch = '???';
        } else if (ch == 'C') {
            ch = '???';
        } else if (ch == 'D') {
            ch = '???';
        } else if (ch == 'E') {
            ch = '???';
        } else if (ch == 'F') {
            ch = '???';
        } else if (ch == 'G') {
            ch = '???';
        } else if (ch == 'H') {
            ch = '???';
        } else if (ch == 'I') {
            ch = '???';
        } else if (ch == 'J') {
            ch = '???';
        } else if (ch == 'K') {
            ch = '???';
        } else if (ch == 'L') {
            ch = '???';
        } else if (ch == 'M') {
            ch = '???';
        } else if (ch == 'N') {
            ch = '???';
        } else if (ch == 'O') {
            ch = '???';
        } else if (ch == 'P') {
            ch = '???';
        } else if (ch == 'Q') {
            ch = '???';
        } else if (ch == 'R') {
            ch = '???';
        } else if (ch == 'S') {
            ch = '???';
        } else if (ch == 'T') {
            ch = '???';
        } else if (ch == 'U') {
            ch = '???';
        } else if (ch == 'V') {
            ch = '???';
        } else if (ch == 'W') {
            ch = '???';
        } else if (ch == 'X') {
            ch = '???';
        } else if (ch == 'Y') {
            ch = '???';
        } else if (ch == 'Z') {
            ch = '???';
        } else if (ch == 'a') {
            ch = '???';
        } else if (ch == 'b') {
            ch = '???';
        } else if (ch == 'c') {
            ch = '???';
        } else if (ch == 'd') {
            ch = '???';
        } else if (ch == 'e') {
            ch = '???';
        } else if (ch == 'f') {
            ch = '???';
        } else if (ch == 'g') {
            ch = '???';
        } else if (ch == 'h') {
            ch = '???';
        } else if (ch == 'i') {
            ch = '???';
        } else if (ch == 'j') {
            ch = '???';
        } else if (ch == 'k') {
            ch = '???';
        } else if (ch == 'l') {
            ch = '???';
        } else if (ch == 'm') {
            ch = '???';
        } else if (ch == 'n') {
            ch = '???';
        } else if (ch == 'o') {
            ch = '???';
        } else if (ch == 'p') {
            ch = '???';
        } else if (ch == 'q') {
            ch = '???';
        } else if (ch == 'r') {
            ch = '???';
        } else if (ch == 's') {
            ch = '???';
        } else if (ch == 't') {
            ch = '???';
        } else if (ch == 'u') {
            ch = '???';
        } else if (ch == 'v') {
            ch = '???';
        } else if (ch == 'w') {
            ch = '???';
        } else if (ch == 'x') {
            ch = '???';
        } else if (ch == 'y') {
            ch = '???';
        } else if (ch == 'z') {
            ch = '???';
        } else if (ch == '0') {
            ch = '???';
        } else if (ch == '1') {
            ch = '???';
        } else if (ch == '2') {
            ch = '???';
        } else if (ch == '3') {
            ch = '???';
        } else if (ch == '4') {
            ch = '???';
        } else if (ch == '5') {
            ch = '???';
        } else if (ch == '6') {
            ch = '???';
        } else if (ch == '7') {
            ch = '???';
        } else if (ch == '8') {
            ch = '???';
        } else if (ch == '9') {
            ch = '???';
        }

        return ch;
    }

    private char getSpecialCharSecond(char a) {
        char ch = a;

        if (ch == 'A') {
            ch = '???';
        } else if (ch == 'B') {
            ch = '???';
        } else if (ch == 'C') {
            ch = '???';
        } else if (ch == 'D') {
            ch = '??';
        } else if (ch == 'E') {
            ch = '??';
        } else if (ch == 'F') {
            ch = '???';
        } else if (ch == 'G') {
            ch = '???';
        } else if (ch == 'H') {
            ch = '???';
        } else if (ch == 'I') {
            ch = '??';
        } else if (ch == 'K') {
            ch = '???';
        } else if (ch == 'L') {
            ch = '???';
        } else if (ch == 'M') {
            ch = '???';
        } else if (ch == 'N') {
            ch = '???';
        } else if (ch == 'O') {
            ch = '??';
        } else if (ch == 'P') {
            ch = '???';
        } else if (ch == 'R') {
            ch = '???';
        } else if (ch == 'S') {
            ch = '???';
        } else if (ch == 'T') {
            ch = '???';
        } else if (ch == 'U') {
            ch = '??';
        } else if (ch == 'W') {
            ch = '???';
        } else if (ch == 'X') {
            ch = '??';
        } else if (ch == 'Y') {
            ch = '??';
        } else if (ch == 'Z') {
            ch = '???';
        } else if (ch == 'a') {
            ch = '???';
        } else if (ch == 'b') {
            ch = '???';
        } else if (ch == 'c') {
            ch = '???';
        } else if (ch == 'd') {
            ch = '??';
        } else if (ch == 'e') {
            ch = '??';
        } else if (ch == 'f') {
            ch = '???';
        } else if (ch == 'g') {
            ch = '???';
        } else if (ch == 'h') {
            ch = '???';
        } else if (ch == 'i') {
            ch = '??';
        } else if (ch == 'j') {
            ch = 'J';
        } else if (ch == 'k') {
            ch = '???';
        } else if (ch == 'l') {
            ch = '???';
        } else if (ch == 'm') {
            ch = '???';
        } else if (ch == 'n') {
            ch = '???';
        } else if (ch == 'o') {
            ch = '??';
        } else if (ch == 'p') {
            ch = '???';
        } else if (ch == 'q') {
            ch = 'Q';
        } else if (ch == 'r') {
            ch = '???';
        } else if (ch == 's') {
            ch = '???';
        } else if (ch == 't') {
            ch = '???';
        } else if (ch == 'u') {
            ch = '??';
        } else if (ch == 'v') {
            ch = 'V';
        } else if (ch == 'w') {
            ch = '???';
        } else if (ch == 'x') {
            ch = '??';
        } else if (ch == 'y') {
            ch = '??';
        } else if (ch == 'z') {
            ch = '???';
        }

        return ch;
    }

    private char getSpecialCharThird(char a) {
        char ch = a;

        if (ch == 'A' || ch == 'a') {
            ch = '???';
        } else if (ch == 'B' || ch == 'b') {
            ch = 'b';
        } else if (ch == 'C' || ch == 'c') {
            ch = '???';
        } else if (ch == 'D' || ch == 'd') {
            ch = '???';
        } else if (ch == 'E' || ch == 'e') {
            ch = '???';
        } else if (ch == 'F' || ch == 'f') {
            ch = 'f';
        } else if (ch == 'G' || ch == 'g') {
            ch = '???';
        } else if (ch == 'H' || ch == 'h') {
            ch = 'h';
        } else if (ch == 'I' || ch == 'i') {
            ch = '???';
        } else if (ch == 'J' || ch == 'j') {
            ch = 'j';
        } else if (ch == 'K' || ch == 'k') {
            ch = '???';
        } else if (ch == 'L' || ch == 'l') {
            ch = '???';
        } else if (ch == 'M' || ch == 'm') {
            ch = 'm';
        } else if (ch == 'N' || ch == 'n') {
            ch = '???';
        } else if (ch == 'O' || ch == 'o') {
            ch = '???';
        } else if (ch == 'P' || ch == 'p') {
            ch = '???';
        } else if (ch == 'Q' || ch == 'q') {
            ch = 'q';
        } else if (ch == 'R' || ch == 'r') {
            ch = '???';
        } else if (ch == 'S' || ch == 's') {
            ch = 's';
        } else if (ch == 'T' || ch == 't') {
            ch = '???';
        } else if (ch == 'U' || ch == 'u') {
            ch = 'u';
        } else if (ch == 'V' || ch == 'v') {
            ch = '???';
        } else if (ch == 'W' || ch == 'w') {
            ch = '???';
        } else if (ch == 'X' || ch == 'x') {
            ch = 'x';
        } else if (ch == 'Y' || ch == 'y') {
            ch = '???';
        } else if (ch == 'Z' || ch == 'z') {
            ch = '???';
        }

        return ch;
    }

    private char getSpecialCharFourth(char a) {
        char ch = a;

        if (ch == 'A') {
            ch = '???';
        } else if (ch == 'B') {
            ch = '???';
        } else if (ch == 'C') {
            ch = '???';
        } else if (ch == 'D') {
            ch = '???';
        } else if (ch == 'E') {
            ch = '???';
        } else if (ch == 'F') {
            ch = '???';
        } else if (ch == 'G') {
            ch = '???';
        } else if (ch == 'H') {
            ch = '???';
        } else if (ch == 'I') {
            ch = '???';
        } else if (ch == 'K') {
            ch = '???';
        } else if (ch == 'L') {
            ch = '???';
        } else if (ch == 'M') {
            ch = '???';
        } else if (ch == 'N') {
            ch = '???';
        } else if (ch == 'O') {
            ch = '???';
        } else if (ch == 'P') {
            ch = '???';
        } else if (ch == 'R') {
            ch = '???';
        } else if (ch == 'S') {
            ch = '???';
        } else if (ch == 'T') {
            ch = '???';
        } else if (ch == 'U') {
            ch = '???';
        } else if (ch == 'V') {
            ch = '???';
        } else if (ch == 'W') {
            ch = '???';
        } else if (ch == 'X') {
            ch = '???';
        } else if (ch == 'Y') {
            ch = '???';
        } else if (ch == 'Z') {
            ch = '???';
        } else if (ch == 'a') {
            ch = '???';
        } else if (ch == 'b') {
            ch = '???';
        } else if (ch == 'c') {
            ch = '???';
        } else if (ch == 'd') {
            ch = '???';
        } else if (ch == 'e') {
            ch = '???';
        } else if (ch == 'f') {
            ch = '???';
        } else if (ch == 'g') {
            ch = '???';
        } else if (ch == 'h') {
            ch = '???';
        } else if (ch == 'i') {
            ch = '???';
        } else if (ch == 'k') {
            ch = '???';
        } else if (ch == 'l') {
            ch = '???';
        } else if (ch == 'm') {
            ch = '???';
        } else if (ch == 'n') {
            ch = '???';
        } else if (ch == 'o') {
            ch = '???';
        } else if (ch == 'p') {
            ch = '???';
        } else if (ch == 'r') {
            ch = '???';
        } else if (ch == 's') {
            ch = '???';
        } else if (ch == 't') {
            ch = '???';
        } else if (ch == 'u') {
            ch = '???';
        } else if (ch == 'v') {
            ch = '???';
        } else if (ch == 'w') {
            ch = '???';
        } else if (ch == 'x') {
            ch = '???';
        } else if (ch == 'y') {
            ch = '???';
        } else if (ch == 'z') {
            ch = '???';
        }

        return ch;
    }

    private char getSpecialCharFifth(char a) {
        char ch = a;

        if (ch == 'A' || ch == 'a') {
            ch = '??';
        } else if (ch == 'B' || ch == 'b') {
            ch = '??';
        } else if (ch == 'C' || ch == 'c') {
            ch = '??';
        } else if (ch == 'D' || ch == 'd') {
            ch = '???';
        } else if (ch == 'E' || ch == 'e') {
            ch = '??';
        } else if (ch == 'F' || ch == 'f') {
            ch = 'f';
        } else if (ch == 'G' || ch == 'g') {
            ch = 'g';
        } else if (ch == 'H' || ch == 'h') {
            ch = '??';
        } else if (ch == 'I' || ch == 'i') {
            ch = '??';
        } else if (ch == 'J' || ch == 'j') {
            ch = '??';
        } else if (ch == 'K' || ch == 'k') {
            ch = '??';
        } else if (ch == 'L' || ch == 'l') {
            ch = '???';
        } else if (ch == 'M' || ch == 'm') {
            ch = '??';
        } else if (ch == 'N' || ch == 'n') {
            ch = '??';
        } else if (ch == 'O' || ch == 'o') {
            ch = '??';
        } else if (ch == 'P' || ch == 'p') {
            ch = '??';
        } else if (ch == 'Q' || ch == 'q') {
            ch = 'q';
        } else if (ch == 'R' || ch == 'r') {
            ch = '??';
        } else if (ch == 'S' || ch == 's') {
            ch = 's';
        } else if (ch == 'T' || ch == 't') {
            ch = '??';
        } else if (ch == 'U' || ch == 'u') {
            ch = '??';
        } else if (ch == 'V' || ch == 'v') {
            ch = '??';
        } else if (ch == 'W' || ch == 'w') {
            ch = '??';
        } else if (ch == 'X' || ch == 'x') {
            ch = '??';
        } else if (ch == 'Y' || ch == 'y') {
            ch = '??';
        } else if (ch == 'Z' || ch == 'z') {
            ch = 'z';
        }

        return ch;
    }

    private char getSpecialCharSixth(char a) {
        char ch = a;

        if (ch == 'A' || ch == 'a') {
            ch = '??';
        } else if (ch == 'B' || ch == 'b') {
            ch = '??';
        } else if (ch == 'C' || ch == 'c') {
            ch = '??';
        } else if (ch == 'D' || ch == 'd') {
            ch = '??';
        } else if (ch == 'E' || ch == 'e') {
            ch = '???';
        } else if (ch == 'F' || ch == 'f') {
            ch = '??';
        } else if (ch == 'G' || ch == 'g') {
            ch = '??';
        } else if (ch == 'H' || ch == 'h') {
            ch = '??';
        } else if (ch == 'I' || ch == 'i') {
            ch = '??';
        } else if (ch == 'J' || ch == 'j') {
            ch = '??';
        } else if (ch == 'K' || ch == 'k') {
            ch = '??';
        } else if (ch == 'L' || ch == 'l') {
            ch = '??';
        } else if (ch == 'M' || ch == 'm') {
            ch = '??';
        } else if (ch == 'N' || ch == 'n') {
            ch = '??';
        } else if (ch == 'O' || ch == 'o') {
            ch = '???';
        } else if (ch == 'P' || ch == 'p') {
            ch = '??';
        } else if (ch == 'Q' || ch == 'q') {
            ch = '??';
        } else if (ch == 'R' || ch == 'r') {
            ch = '??';
        } else if (ch == 'S' || ch == 's') {
            ch = '??';
        } else if (ch == 'T' || ch == 't') {
            ch = '??';
        } else if (ch == 'U' || ch == 'u') {
            ch = '??';
        } else if (ch == 'V' || ch == 'v') {
            ch = '??';
        } else if (ch == 'W' || ch == 'w') {
            ch = '??';
        } else if (ch == 'X' || ch == 'x') {
            ch = '??';
        } else if (ch == 'Y' || ch == 'y') {
            ch = '??';
        } else if (ch == 'Z' || ch == 'z') {
            ch = '??';
        }

        return ch;
    }

    private char getSpecialCharSeventh(char a) {
        char ch = a;

        if (ch == 'A' || ch == 'a') {
            ch = 'A';
        } else if (ch == 'B' || ch == 'b') {
            ch = '??';
        } else if (ch == 'C' || ch == 'c') {
            ch = '??';
        } else if (ch == 'D' || ch == 'd') {
            ch = '??';
        } else if (ch == 'E' || ch == 'e') {
            ch = '??';
        } else if (ch == 'F' || ch == 'f') {
            ch = '??';
        } else if (ch == 'G' || ch == 'g') {
            ch = '??';
        } else if (ch == 'H' || ch == 'h') {
            ch = '??';
        } else if (ch == 'I' || ch == 'i') {
            ch = '??';
        } else if (ch == 'J' || ch == 'j') {
            ch = '??';
        } else if (ch == 'K' || ch == 'k') {
            ch = '??';
        } else if (ch == 'L' || ch == 'l') {
            ch = '??';
        } else if (ch == 'M' || ch == 'm') {
            ch = 'M';
        } else if (ch == 'N' || ch == 'n') {
            ch = '??';
        } else if (ch == 'O' || ch == 'o') {
            ch = '??';
        } else if (ch == 'P' || ch == 'p') {
            ch = '??';
        } else if (ch == 'Q' || ch == 'q') {
            ch = '??';
        } else if (ch == 'R' || ch == 'r') {
            ch = '??';
        } else if (ch == 'S' || ch == 's') {
            ch = '??';
        } else if (ch == 'T' || ch == 't') {
            ch = '??';
        } else if (ch == 'U' || ch == 'u') {
            ch = '??';
        } else if (ch == 'V' || ch == 'v') {
            ch = '??';
        } else if (ch == 'W' || ch == 'w') {
            ch = '??';
        } else if (ch == 'X' || ch == 'x') {
            ch = '??';
        } else if (ch == 'Y' || ch == 'y') {
            ch = '??';
        } else if (ch == 'Z' || ch == 'z') {
            ch = '??';
        }

        return ch;
    }


    @Override
    public int getItemCount() {
        return fontItems.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView description;
        CardView cardView;

        private MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleTV);
            description = itemView.findViewById(R.id.descriptionTV);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }
}


