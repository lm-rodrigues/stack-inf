package persistence;

import domain.Question;
import domain.Answer;
import domain.Comment;
import domain.AbstractContent;
import java.util.List;

public class ContentsCRUD extends AbstractCRUD {

	public ContentsCRUD() {

	}

	public Void create(AbstractContent newContent) {
		return null;
	}

	public Question readQuestion(Integer questionID) {
		return null;
	}

	public Answer readAnswer(Integer answerID) {
		return null;
	}

	public Comment readComments(Integer commentID) {
		return null;
	}

	public Void update(AbstractContent content) {
		return null;
	}

	public void delete(AbstractContent content) {

	}

	public List<Question> search(String query) {
		return null;
	}

	public List<Question> listAllQuestion() {
		return null;
	}

	public Double getMaxQuestionId() {
		return null;
	}

	public Double getMaxCommentId() {
		return null;
	}

	public Double getMaxAnswerId() {
		return null;
	}

}