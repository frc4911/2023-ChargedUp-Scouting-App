package com.example.a2022frcscoutingapp;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thebluealliance.api.v3.TBA;
import com.thebluealliance.api.v3.models.SimpleMatch;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void tba_test() throws IOException
    {
        TBA api = new TBA("AdKpprz7naDhuNjNCAqgzT8QY46m9jBTEgHNNUMiSH5qfUefZwAWHdbomLHagWU6");
        SimpleMatch[] simpleMatches = api.eventRequest.getSimpleMatches("2023wasno");
        System.out.println();
    }

    @Test
    public void test_code()
    {
    }


    class MatchInfo
    {
        private int matchNumber;
        private List<Integer> teamNumber;
        private List<String> station;
    }

    class TeamMatchInfo
    {
        private int matchNumber;
        private int teamNumber;
        private String station;
    }

    class MatchScoutInfo
    {
        private int matchNumber;
        private String station;
    }

    private Map<MatchScoutInfo, Integer> getMatchInfoToTeamNumberMap() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        //TODO: Get file name
        List<MatchInfo> matchInfoList = mapper.readValue(new File("sampleFile"), new TypeReference<List<MatchInfo>>(){});

        //TODO: Convert List of MatchInfo to Map of MatchScoutInfo -> Integer
        return null;
    }

    private void experiment() throws IOException
    {
        TBA api = new TBA("AdKpprz7naDhuNjNCAqgzT8QY46m9jBTEgHNNUMiSH5qfUefZwAWHdbomLHagWU6");
        api.eventRequest.getSimpleMatches("2023wasno");
    }
}