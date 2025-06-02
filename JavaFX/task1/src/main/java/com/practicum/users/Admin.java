package com.practicum.users;

import com.practicum.actions.AdminActions;
import com.practicum.exceptions.InvalidCredentialsException;
import com.practicum.models.ItemStatus;
import com.practicum.storage.GlobalData;
import com.practicum.models.Item;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Admin extends User implements AdminActions {
}
