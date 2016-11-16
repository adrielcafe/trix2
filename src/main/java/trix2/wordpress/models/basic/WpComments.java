package trix2.wordpress.models.basic;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_comments", schema = "multiwp", catalog = "")
public class WpComments {
	private Long commentId;
	private Long commentPostId;
	private Long commentAuthor;
	private String commentAuthorEmail;
	private String commentAuthorUrl;
	private String commentAuthorIp;
	private Timestamp commentDate;
	private Timestamp commentDateGmt;
	private String commentContent;
	private Integer commentKarma;
	private String commentApproved;
	private String commentAgent;
	private String commentType;
	private Long commentParent;
	private Long userId;

	@Id
	@Column(name = "comment_ID", nullable = false)
	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	@Basic
	@Column(name = "comment_post_ID", nullable = false)
	public Long getCommentPostId() {
		return commentPostId;
	}

	public void setCommentPostId(Long commentPostId) {
		this.commentPostId = commentPostId;
	}

	@Basic
	@Column(name = "comment_author", nullable = false, length = -1)
	public Long getCommentAuthor() {
		return commentAuthor;
	}

	public void setCommentAuthor(Long commentAuthor) {
		this.commentAuthor = commentAuthor;
	}

	@Basic
	@Column(name = "comment_author_email", nullable = false, length = 100)
	public String getCommentAuthorEmail() {
		return commentAuthorEmail;
	}

	public void setCommentAuthorEmail(String commentAuthorEmail) {
		this.commentAuthorEmail = commentAuthorEmail;
	}

	@Basic
	@Column(name = "comment_author_url", nullable = false, length = 200)
	public String getCommentAuthorUrl() {
		return commentAuthorUrl;
	}

	public void setCommentAuthorUrl(String commentAuthorUrl) {
		this.commentAuthorUrl = commentAuthorUrl;
	}

	@Basic
	@Column(name = "comment_author_IP", nullable = false, length = 100)
	public String getCommentAuthorIp() {
		return commentAuthorIp;
	}

	public void setCommentAuthorIp(String commentAuthorIp) {
		this.commentAuthorIp = commentAuthorIp;
	}

	@Basic
	@Column(name = "comment_date", nullable = false)
	public Timestamp getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Timestamp commentDate) {
		this.commentDate = commentDate;
	}

	@Basic
	@Column(name = "comment_date_gmt", nullable = false)
	public Timestamp getCommentDateGmt() {
		return commentDateGmt;
	}

	public void setCommentDateGmt(Timestamp commentDateGmt) {
		this.commentDateGmt = commentDateGmt;
	}

	@Basic
	@Column(name = "comment_content", nullable = false, length = -1)
	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	@Basic
	@Column(name = "comment_karma", nullable = false)
	public Integer getCommentKarma() {
		return commentKarma;
	}

	public void setCommentKarma(Integer commentKarma) {
		this.commentKarma = commentKarma;
	}

	@Basic
	@Column(name = "comment_approved", nullable = false, length = 20)
	public String getCommentApproved() {
		return commentApproved;
	}

	public void setCommentApproved(String commentApproved) {
		this.commentApproved = commentApproved;
	}

	@Basic
	@Column(name = "comment_agent", nullable = false, length = 255)
	public String getCommentAgent() {
		return commentAgent;
	}

	public void setCommentAgent(String commentAgent) {
		this.commentAgent = commentAgent;
	}

	@Basic
	@Column(name = "comment_type", nullable = false, length = 20)
	public String getCommentType() {
		return commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}

	@Basic
	@Column(name = "comment_parent", nullable = false)
	public Long getCommentParent() {
		return commentParent;
	}

	public void setCommentParent(Long commentParent) {
		this.commentParent = commentParent;
	}

	@Basic
	@Column(name = "user_id", nullable = false)
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpComments that = (WpComments) o;

		if (commentId != null ? !commentId.equals(that.commentId) : that.commentId != null) return false;
		if (commentPostId != null ? !commentPostId.equals(that.commentPostId) : that.commentPostId != null)
			return false;
		if (commentAuthor != null ? !commentAuthor.equals(that.commentAuthor) : that.commentAuthor != null)
			return false;
		if (commentAuthorEmail != null ? !commentAuthorEmail.equals(that.commentAuthorEmail) : that.commentAuthorEmail != null)
			return false;
		if (commentAuthorUrl != null ? !commentAuthorUrl.equals(that.commentAuthorUrl) : that.commentAuthorUrl != null)
			return false;
		if (commentAuthorIp != null ? !commentAuthorIp.equals(that.commentAuthorIp) : that.commentAuthorIp != null)
			return false;
		if (commentDate != null ? !commentDate.equals(that.commentDate) : that.commentDate != null) return false;
		if (commentDateGmt != null ? !commentDateGmt.equals(that.commentDateGmt) : that.commentDateGmt != null)
			return false;
		if (commentContent != null ? !commentContent.equals(that.commentContent) : that.commentContent != null)
			return false;
		if (commentKarma != null ? !commentKarma.equals(that.commentKarma) : that.commentKarma != null) return false;
		if (commentApproved != null ? !commentApproved.equals(that.commentApproved) : that.commentApproved != null)
			return false;
		if (commentAgent != null ? !commentAgent.equals(that.commentAgent) : that.commentAgent != null) return false;
		if (commentType != null ? !commentType.equals(that.commentType) : that.commentType != null) return false;
		if (commentParent != null ? !commentParent.equals(that.commentParent) : that.commentParent != null)
			return false;
		if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = commentId != null ? commentId.hashCode() : 0;
		result = 31 * result + (commentPostId != null ? commentPostId.hashCode() : 0);
		result = 31 * result + (commentAuthor != null ? commentAuthor.hashCode() : 0);
		result = 31 * result + (commentAuthorEmail != null ? commentAuthorEmail.hashCode() : 0);
		result = 31 * result + (commentAuthorUrl != null ? commentAuthorUrl.hashCode() : 0);
		result = 31 * result + (commentAuthorIp != null ? commentAuthorIp.hashCode() : 0);
		result = 31 * result + (commentDate != null ? commentDate.hashCode() : 0);
		result = 31 * result + (commentDateGmt != null ? commentDateGmt.hashCode() : 0);
		result = 31 * result + (commentContent != null ? commentContent.hashCode() : 0);
		result = 31 * result + (commentKarma != null ? commentKarma.hashCode() : 0);
		result = 31 * result + (commentApproved != null ? commentApproved.hashCode() : 0);
		result = 31 * result + (commentAgent != null ? commentAgent.hashCode() : 0);
		result = 31 * result + (commentType != null ? commentType.hashCode() : 0);
		result = 31 * result + (commentParent != null ? commentParent.hashCode() : 0);
		result = 31 * result + (userId != null ? userId.hashCode() : 0);
		return result;
	}
}
