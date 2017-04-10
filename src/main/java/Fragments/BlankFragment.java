package Fragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.meher.appjhr.R;
import com.twitter.sdk.android.tweetui.SearchTimeline;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;


public class BlankFragment extends ListFragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        final SearchTimeline searchTimeline = new SearchTimeline.Builder().query("#Appjohari").build();

        final TweetTimelineListAdapter tweetTimelineListAdapter = new TweetTimelineListAdapter.Builder(getActivity()).setTimeline(searchTimeline).build();
        setListAdapter(tweetTimelineListAdapter);



        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank,container,false);
    }
}
