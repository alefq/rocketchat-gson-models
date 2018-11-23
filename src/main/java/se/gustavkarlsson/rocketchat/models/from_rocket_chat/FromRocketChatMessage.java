package se.gustavkarlsson.rocketchat.models.from_rocket_chat;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.Objects;

public final class FromRocketChatMessage {

	@SerializedName("id")
	private Long id;

	@SerializedName("message_id")
	private String messageId;

	@SerializedName("token")
	private String token;

	@SerializedName("channel_id")
	private String channelId;

	@SerializedName("channel_name")
	private String channelName;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("user_name")
	private String userName;

	@SerializedName("text")
	private String text;

	@SerializedName("bot")
	private Boolean bot;

	@SerializedName("alias")
	private String alias;

	@SerializedName("timestamp")
	private Date timestamp;

	@SerializedName("user")
	private User user;

	@SerializedName("room")
	private Room room;

	@SerializedName("message")
	private Message message;

	public FromRocketChatMessage() {
	}

	public FromRocketChatMessage(Long id, String messageId, String token, String channelId, String channelName, String userId, String userName, String text, Boolean bot, String alias, Date timestamp, User user, Room room, Message message) {
		this.id = id;
		this.messageId = messageId;
		this.token = token;
		this.channelId = channelId;
		this.channelName = channelName;
		this.userId = userId;
		this.userName = userName;
		this.text = text;
		this.bot = bot;
		this.alias = alias;
		this.timestamp = timestamp;
		this.user = user;
		this.room = room;
		this.message = message;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean isBot() {
		return bot;
	}

	public void setBot(Boolean bot) {
		this.bot = bot;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FromRocketChatMessage that = (FromRocketChatMessage) o;
		return Objects.equals(id, that.id) &&
				Objects.equals(messageId, that.messageId) &&
				Objects.equals(token, that.token) &&
				Objects.equals(channelId, that.channelId) &&
				Objects.equals(channelName, that.channelName) &&
				Objects.equals(userId, that.userId) &&
				Objects.equals(userName, that.userName) &&
				Objects.equals(text, that.text) &&
				Objects.equals(bot, that.bot) &&
				Objects.equals(alias, that.alias) &&
				Objects.equals(timestamp, that.timestamp) &&
				Objects.equals(user, that.user) &&
				Objects.equals(room, that.room) &&
				Objects.equals(message, that.message);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, messageId, token, channelId, channelName, userId, userName, text, bot, alias, timestamp, user, room, message);
	}

	@Override
	public String toString() {
		return "FromRocketChatMessage{" +
				"id=" + id +
				", messageId='" + messageId + '\'' +
				", token='" + token + '\'' +
				", channelId='" + channelId + '\'' +
				", channelName='" + channelName + '\'' +
				", userId='" + userId + '\'' +
				", userName='" + userName + '\'' +
				", text='" + text + '\'' +
				", bot='" + bot + '\'' +
				", alias='" + alias + '\'' +
				", timestamp=" + timestamp +
				", user=" + user +
				", room=" + room +
				", message=" + message +
				'}';
	}
}
