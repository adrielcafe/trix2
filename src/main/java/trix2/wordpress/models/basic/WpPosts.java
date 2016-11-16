package trix2.wordpress.models.basic;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_posts", schema = "multiwp", catalog = "")
public class WpPosts {
	private Long id;
	private Long postAuthor;
	private Timestamp postDate;
	private Timestamp postDateGmt;
	private String postContent;
	private String postTitle;
	private String postExcerpt;
	private String postStatus;
	private String commentStatus;
	private String pingStatus;
	private String postPassword;
	private String postName;
	private String toPing;
	private String pinged;
	private Timestamp postModified;
	private Timestamp postModifiedGmt;
	private String postContentFiltered;
	private Long postParent;
	private String guid;
	private Integer menuOrder;
	private String postType;
	private String postMimeType;
	private Long commentCount;

	@Id
	@Column(name = "ID", nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "post_author", nullable = false)
	public Long getPostAuthor() {
		return postAuthor;
	}

	public void setPostAuthor(Long postAuthor) {
		this.postAuthor = postAuthor;
	}

	@Basic
	@Column(name = "post_date", nullable = false)
	public Timestamp getPostDate() {
		return postDate;
	}

	public void setPostDate(Timestamp postDate) {
		this.postDate = postDate;
	}

	@Basic
	@Column(name = "post_date_gmt", nullable = false)
	public Timestamp getPostDateGmt() {
		return postDateGmt;
	}

	public void setPostDateGmt(Timestamp postDateGmt) {
		this.postDateGmt = postDateGmt;
	}

	@Basic
	@Column(name = "post_content", nullable = false, length = -1)
	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	@Basic
	@Column(name = "post_title", nullable = false, length = -1)
	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	@Basic
	@Column(name = "post_excerpt", nullable = false, length = -1)
	public String getPostExcerpt() {
		return postExcerpt;
	}

	public void setPostExcerpt(String postExcerpt) {
		this.postExcerpt = postExcerpt;
	}

	@Basic
	@Column(name = "post_status", nullable = false, length = 20)
	public String getPostStatus() {
		return postStatus;
	}

	public void setPostStatus(String postStatus) {
		this.postStatus = postStatus;
	}

	@Basic
	@Column(name = "comment_status", nullable = false, length = 20)
	public String getCommentStatus() {
		return commentStatus;
	}

	public void setCommentStatus(String commentStatus) {
		this.commentStatus = commentStatus;
	}

	@Basic
	@Column(name = "ping_status", nullable = false, length = 20)
	public String getPingStatus() {
		return pingStatus;
	}

	public void setPingStatus(String pingStatus) {
		this.pingStatus = pingStatus;
	}

	@Basic
	@Column(name = "post_password", nullable = false, length = 20)
	public String getPostPassword() {
		return postPassword;
	}

	public void setPostPassword(String postPassword) {
		this.postPassword = postPassword;
	}

	@Basic
	@Column(name = "post_name", nullable = false, length = 200)
	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	@Basic
	@Column(name = "to_ping", nullable = false, length = -1)
	public String getToPing() {
		return toPing;
	}

	public void setToPing(String toPing) {
		this.toPing = toPing;
	}

	@Basic
	@Column(name = "pinged", nullable = false, length = -1)
	public String getPinged() {
		return pinged;
	}

	public void setPinged(String pinged) {
		this.pinged = pinged;
	}

	@Basic
	@Column(name = "post_modified", nullable = false)
	public Timestamp getPostModified() {
		return postModified;
	}

	public void setPostModified(Timestamp postModified) {
		this.postModified = postModified;
	}

	@Basic
	@Column(name = "post_modified_gmt", nullable = false)
	public Timestamp getPostModifiedGmt() {
		return postModifiedGmt;
	}

	public void setPostModifiedGmt(Timestamp postModifiedGmt) {
		this.postModifiedGmt = postModifiedGmt;
	}

	@Basic
	@Column(name = "post_content_filtered", nullable = false, length = -1)
	public String getPostContentFiltered() {
		return postContentFiltered;
	}

	public void setPostContentFiltered(String postContentFiltered) {
		this.postContentFiltered = postContentFiltered;
	}

	@Basic
	@Column(name = "post_parent", nullable = false)
	public Long getPostParent() {
		return postParent;
	}

	public void setPostParent(Long postParent) {
		this.postParent = postParent;
	}

	@Basic
	@Column(name = "guid", nullable = false, length = 255)
	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	@Basic
	@Column(name = "menu_order", nullable = false)
	public Integer getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}

	@Basic
	@Column(name = "post_type", nullable = false, length = 20)
	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	@Basic
	@Column(name = "post_mime_type", nullable = false, length = 100)
	public String getPostMimeType() {
		return postMimeType;
	}

	public void setPostMimeType(String postMimeType) {
		this.postMimeType = postMimeType;
	}

	@Basic
	@Column(name = "comment_count", nullable = false)
	public Long getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpPosts wpPosts = (WpPosts) o;

		if (id != null ? !id.equals(wpPosts.id) : wpPosts.id != null) return false;
		if (postAuthor != null ? !postAuthor.equals(wpPosts.postAuthor) : wpPosts.postAuthor != null) return false;
		if (postDate != null ? !postDate.equals(wpPosts.postDate) : wpPosts.postDate != null) return false;
		if (postDateGmt != null ? !postDateGmt.equals(wpPosts.postDateGmt) : wpPosts.postDateGmt != null) return false;
		if (postContent != null ? !postContent.equals(wpPosts.postContent) : wpPosts.postContent != null) return false;
		if (postTitle != null ? !postTitle.equals(wpPosts.postTitle) : wpPosts.postTitle != null) return false;
		if (postExcerpt != null ? !postExcerpt.equals(wpPosts.postExcerpt) : wpPosts.postExcerpt != null) return false;
		if (postStatus != null ? !postStatus.equals(wpPosts.postStatus) : wpPosts.postStatus != null) return false;
		if (commentStatus != null ? !commentStatus.equals(wpPosts.commentStatus) : wpPosts.commentStatus != null)
			return false;
		if (pingStatus != null ? !pingStatus.equals(wpPosts.pingStatus) : wpPosts.pingStatus != null) return false;
		if (postPassword != null ? !postPassword.equals(wpPosts.postPassword) : wpPosts.postPassword != null)
			return false;
		if (postName != null ? !postName.equals(wpPosts.postName) : wpPosts.postName != null) return false;
		if (toPing != null ? !toPing.equals(wpPosts.toPing) : wpPosts.toPing != null) return false;
		if (pinged != null ? !pinged.equals(wpPosts.pinged) : wpPosts.pinged != null) return false;
		if (postModified != null ? !postModified.equals(wpPosts.postModified) : wpPosts.postModified != null)
			return false;
		if (postModifiedGmt != null ? !postModifiedGmt.equals(wpPosts.postModifiedGmt) : wpPosts.postModifiedGmt != null)
			return false;
		if (postContentFiltered != null ? !postContentFiltered.equals(wpPosts.postContentFiltered) : wpPosts.postContentFiltered != null)
			return false;
		if (postParent != null ? !postParent.equals(wpPosts.postParent) : wpPosts.postParent != null) return false;
		if (guid != null ? !guid.equals(wpPosts.guid) : wpPosts.guid != null) return false;
		if (menuOrder != null ? !menuOrder.equals(wpPosts.menuOrder) : wpPosts.menuOrder != null) return false;
		if (postType != null ? !postType.equals(wpPosts.postType) : wpPosts.postType != null) return false;
		if (postMimeType != null ? !postMimeType.equals(wpPosts.postMimeType) : wpPosts.postMimeType != null)
			return false;
		if (commentCount != null ? !commentCount.equals(wpPosts.commentCount) : wpPosts.commentCount != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (postAuthor != null ? postAuthor.hashCode() : 0);
		result = 31 * result + (postDate != null ? postDate.hashCode() : 0);
		result = 31 * result + (postDateGmt != null ? postDateGmt.hashCode() : 0);
		result = 31 * result + (postContent != null ? postContent.hashCode() : 0);
		result = 31 * result + (postTitle != null ? postTitle.hashCode() : 0);
		result = 31 * result + (postExcerpt != null ? postExcerpt.hashCode() : 0);
		result = 31 * result + (postStatus != null ? postStatus.hashCode() : 0);
		result = 31 * result + (commentStatus != null ? commentStatus.hashCode() : 0);
		result = 31 * result + (pingStatus != null ? pingStatus.hashCode() : 0);
		result = 31 * result + (postPassword != null ? postPassword.hashCode() : 0);
		result = 31 * result + (postName != null ? postName.hashCode() : 0);
		result = 31 * result + (toPing != null ? toPing.hashCode() : 0);
		result = 31 * result + (pinged != null ? pinged.hashCode() : 0);
		result = 31 * result + (postModified != null ? postModified.hashCode() : 0);
		result = 31 * result + (postModifiedGmt != null ? postModifiedGmt.hashCode() : 0);
		result = 31 * result + (postContentFiltered != null ? postContentFiltered.hashCode() : 0);
		result = 31 * result + (postParent != null ? postParent.hashCode() : 0);
		result = 31 * result + (guid != null ? guid.hashCode() : 0);
		result = 31 * result + (menuOrder != null ? menuOrder.hashCode() : 0);
		result = 31 * result + (postType != null ? postType.hashCode() : 0);
		result = 31 * result + (postMimeType != null ? postMimeType.hashCode() : 0);
		result = 31 * result + (commentCount != null ? commentCount.hashCode() : 0);
		return result;
	}
}
