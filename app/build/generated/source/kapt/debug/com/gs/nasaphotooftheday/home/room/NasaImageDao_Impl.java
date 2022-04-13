package com.gs.nasaphotooftheday.home.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NasaImageDao_Impl implements NasaImageDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NasaImageCacheEntity> __insertionAdapterOfNasaImageCacheEntity;

  private final EntityInsertionAdapter<NasaImagesFavoritesCacheEntity> __insertionAdapterOfNasaImagesFavoritesCacheEntity;

  public NasaImageDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNasaImageCacheEntity = new EntityInsertionAdapter<NasaImageCacheEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `nasa_images` (`id`,`date`,`explanation`,`hdurl`,`media_type`,`service_version`,`title`,`url`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NasaImageCacheEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDate());
        }
        if (value.getExplaination() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getExplaination());
        }
        if (value.getHdurl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getHdurl());
        }
        if (value.getMediatype() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMediatype());
        }
        if (value.getServiceVersion() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getServiceVersion());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTitle());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUrl());
        }
      }
    };
    this.__insertionAdapterOfNasaImagesFavoritesCacheEntity = new EntityInsertionAdapter<NasaImagesFavoritesCacheEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `favorite_images` (`id`,`date`,`explanation`,`hdurl`,`media_type`,`service_version`,`title`,`url`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NasaImagesFavoritesCacheEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDate());
        }
        if (value.getExplaination() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getExplaination());
        }
        if (value.getHdurl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getHdurl());
        }
        if (value.getMediatype() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMediatype());
        }
        if (value.getServiceVersion() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getServiceVersion());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTitle());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUrl());
        }
      }
    };
  }

  @Override
  public Object insertNameLogoEntity(final NasaImageCacheEntity cacheEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNasaImageCacheEntity.insert(cacheEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertFavorites(final NasaImagesFavoritesCacheEntity cacheEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNasaImagesFavoritesCacheEntity.insert(cacheEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getLogosAndName(
      final Continuation<? super List<NasaImageCacheEntity>> continuation) {
    final String _sql = "SELECT * from nasa_images";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<NasaImageCacheEntity>>() {
      @Override
      public List<NasaImageCacheEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfExplaination = CursorUtil.getColumnIndexOrThrow(_cursor, "explanation");
          final int _cursorIndexOfHdurl = CursorUtil.getColumnIndexOrThrow(_cursor, "hdurl");
          final int _cursorIndexOfMediatype = CursorUtil.getColumnIndexOrThrow(_cursor, "media_type");
          final int _cursorIndexOfServiceVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "service_version");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final List<NasaImageCacheEntity> _result = new ArrayList<NasaImageCacheEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NasaImageCacheEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpExplaination;
            if (_cursor.isNull(_cursorIndexOfExplaination)) {
              _tmpExplaination = null;
            } else {
              _tmpExplaination = _cursor.getString(_cursorIndexOfExplaination);
            }
            final String _tmpHdurl;
            if (_cursor.isNull(_cursorIndexOfHdurl)) {
              _tmpHdurl = null;
            } else {
              _tmpHdurl = _cursor.getString(_cursorIndexOfHdurl);
            }
            final String _tmpMediatype;
            if (_cursor.isNull(_cursorIndexOfMediatype)) {
              _tmpMediatype = null;
            } else {
              _tmpMediatype = _cursor.getString(_cursorIndexOfMediatype);
            }
            final String _tmpServiceVersion;
            if (_cursor.isNull(_cursorIndexOfServiceVersion)) {
              _tmpServiceVersion = null;
            } else {
              _tmpServiceVersion = _cursor.getString(_cursorIndexOfServiceVersion);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            _item = new NasaImageCacheEntity(_tmpId,_tmpDate,_tmpExplaination,_tmpHdurl,_tmpMediatype,_tmpServiceVersion,_tmpTitle,_tmpUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getFiles(
      final Continuation<? super List<NasaImagesFavoritesCacheEntity>> continuation) {
    final String _sql = "SELECT * from favorite_images";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<NasaImagesFavoritesCacheEntity>>() {
      @Override
      public List<NasaImagesFavoritesCacheEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfExplaination = CursorUtil.getColumnIndexOrThrow(_cursor, "explanation");
          final int _cursorIndexOfHdurl = CursorUtil.getColumnIndexOrThrow(_cursor, "hdurl");
          final int _cursorIndexOfMediatype = CursorUtil.getColumnIndexOrThrow(_cursor, "media_type");
          final int _cursorIndexOfServiceVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "service_version");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final List<NasaImagesFavoritesCacheEntity> _result = new ArrayList<NasaImagesFavoritesCacheEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NasaImagesFavoritesCacheEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpExplaination;
            if (_cursor.isNull(_cursorIndexOfExplaination)) {
              _tmpExplaination = null;
            } else {
              _tmpExplaination = _cursor.getString(_cursorIndexOfExplaination);
            }
            final String _tmpHdurl;
            if (_cursor.isNull(_cursorIndexOfHdurl)) {
              _tmpHdurl = null;
            } else {
              _tmpHdurl = _cursor.getString(_cursorIndexOfHdurl);
            }
            final String _tmpMediatype;
            if (_cursor.isNull(_cursorIndexOfMediatype)) {
              _tmpMediatype = null;
            } else {
              _tmpMediatype = _cursor.getString(_cursorIndexOfMediatype);
            }
            final String _tmpServiceVersion;
            if (_cursor.isNull(_cursorIndexOfServiceVersion)) {
              _tmpServiceVersion = null;
            } else {
              _tmpServiceVersion = _cursor.getString(_cursorIndexOfServiceVersion);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            _item = new NasaImagesFavoritesCacheEntity(_tmpId,_tmpDate,_tmpExplaination,_tmpHdurl,_tmpMediatype,_tmpServiceVersion,_tmpTitle,_tmpUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
