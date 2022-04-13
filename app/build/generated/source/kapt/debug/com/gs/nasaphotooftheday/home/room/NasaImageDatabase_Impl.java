package com.gs.nasaphotooftheday.home.room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NasaImageDatabase_Impl extends NasaImageDatabase {
  private volatile NasaImageDao _nasaImageDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `nasa_images` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` TEXT NOT NULL, `explanation` TEXT NOT NULL, `hdurl` TEXT NOT NULL, `media_type` TEXT NOT NULL, `service_version` TEXT NOT NULL, `title` TEXT NOT NULL, `url` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `favorite_images` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` TEXT NOT NULL, `explanation` TEXT NOT NULL, `hdurl` TEXT NOT NULL, `media_type` TEXT NOT NULL, `service_version` TEXT NOT NULL, `title` TEXT NOT NULL, `url` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4e1073e03035e38c9244b233c98d23db')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `nasa_images`");
        _db.execSQL("DROP TABLE IF EXISTS `favorite_images`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsNasaImages = new HashMap<String, TableInfo.Column>(8);
        _columnsNasaImages.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNasaImages.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNasaImages.put("explanation", new TableInfo.Column("explanation", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNasaImages.put("hdurl", new TableInfo.Column("hdurl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNasaImages.put("media_type", new TableInfo.Column("media_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNasaImages.put("service_version", new TableInfo.Column("service_version", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNasaImages.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNasaImages.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNasaImages = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNasaImages = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNasaImages = new TableInfo("nasa_images", _columnsNasaImages, _foreignKeysNasaImages, _indicesNasaImages);
        final TableInfo _existingNasaImages = TableInfo.read(_db, "nasa_images");
        if (! _infoNasaImages.equals(_existingNasaImages)) {
          return new RoomOpenHelper.ValidationResult(false, "nasa_images(com.gs.nasaphotooftheday.home.room.NasaImageCacheEntity).\n"
                  + " Expected:\n" + _infoNasaImages + "\n"
                  + " Found:\n" + _existingNasaImages);
        }
        final HashMap<String, TableInfo.Column> _columnsFavoriteImages = new HashMap<String, TableInfo.Column>(8);
        _columnsFavoriteImages.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteImages.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteImages.put("explanation", new TableInfo.Column("explanation", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteImages.put("hdurl", new TableInfo.Column("hdurl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteImages.put("media_type", new TableInfo.Column("media_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteImages.put("service_version", new TableInfo.Column("service_version", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteImages.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteImages.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoriteImages = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoriteImages = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteImages = new TableInfo("favorite_images", _columnsFavoriteImages, _foreignKeysFavoriteImages, _indicesFavoriteImages);
        final TableInfo _existingFavoriteImages = TableInfo.read(_db, "favorite_images");
        if (! _infoFavoriteImages.equals(_existingFavoriteImages)) {
          return new RoomOpenHelper.ValidationResult(false, "favorite_images(com.gs.nasaphotooftheday.home.room.NasaImagesFavoritesCacheEntity).\n"
                  + " Expected:\n" + _infoFavoriteImages + "\n"
                  + " Found:\n" + _existingFavoriteImages);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "4e1073e03035e38c9244b233c98d23db", "68636ac44f094a05a12416a16ed72151");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "nasa_images","favorite_images");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `nasa_images`");
      _db.execSQL("DELETE FROM `favorite_images`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(NasaImageDao.class, NasaImageDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public NasaImageDao getCarsNameLogoDao() {
    if (_nasaImageDao != null) {
      return _nasaImageDao;
    } else {
      synchronized(this) {
        if(_nasaImageDao == null) {
          _nasaImageDao = new NasaImageDao_Impl(this);
        }
        return _nasaImageDao;
      }
    }
  }
}
