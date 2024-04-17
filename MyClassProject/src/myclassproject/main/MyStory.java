package myclassproject.main;

import com.storygraph.Graph;

import com.storygraph.Story;
import myclassproject.mystorygraph.MyGraph;

public class MyStory extends Story {

	/**
	 * @return A new object of MyGraph
	 */
	@Override
	public Graph getGraph() {
		return new MyGraph();
	}


}
